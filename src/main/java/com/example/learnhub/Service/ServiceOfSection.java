package com.example.learnhub.Service;

import com.example.learnhub.DTO.ArticleDTO;
import com.example.learnhub.Entity.Section;
import com.example.learnhub.Repository.SectionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class ServiceOfSection {

    private final SectionRepository sectionRepository;
    private final ServiceOfVideo serviceOfVideo;
    private final ServiceOfArticle serviceOfArticle;

    @Autowired
    public ServiceOfSection(SectionRepository sectionRepository, ServiceOfVideo serviceOfVideo, ServiceOfArticle serviceOfArticle) {
        this.sectionRepository = sectionRepository;
        this.serviceOfVideo = serviceOfVideo;
        this.serviceOfArticle = serviceOfArticle;
    }

    public Section createSection(Section section) {
        return sectionRepository.save(section);
    }

    public List<Section> getAllSections() {
        return sectionRepository.findAll();
    }

    public void createVideos(Section section, List<MultipartFile> videoFiles) {
        Section savedSection = sectionRepository.save(section);

        if (videoFiles != null) {
            serviceOfVideo.createVideos(savedSection, videoFiles);
        }

    }

    public void createArticles(Section section, List<ArticleDTO> articleDTOs) {
        Section savedSection = sectionRepository.save(section);

        if (articleDTOs != null) {
            serviceOfArticle.createArticles(savedSection, articleDTOs);
        }

    }
}
