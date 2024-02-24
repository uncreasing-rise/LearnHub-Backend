package com.example.learnhub.Service;

import com.google.api.gax.paging.Page;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.BlobId;
import com.google.cloud.storage.BlobInfo;
import com.google.cloud.storage.Storage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.ByteArrayResource;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Service
public class ServiceOfFile implements IServiceOfFile {
    @Override
    public List<String> listOfFiles() {
        return null;
    }

    @Override
    public ByteArrayResource downloadFile(String fileName) {
        return null;
    }

    @Override
    public boolean deleteFile(String fileName) {
        return false;
    }

    @Override
    public void uploadFile(MultipartFile file) throws IOException {

    }
//
//    @Value("${gcp.bucket.name}")
//    private String bucketName;
//
//
//    @Autowired
//    private Storage storage;
//
//
//    @Override
//    public List<String> listOfFiles() {
//        List<String> list = new ArrayList<>();
//        Page<Blob> blobs = storage.list(bucketName);
//        for (Blob blob : blobs.iterateAll()) {
//            list.add(blob.getName());
//        }
//        return list;
//    }
//
//    @Override
//    public ByteArrayResource downloadFile(String fileName) {
//        Blob blob = storage.get(bucketName, fileName);
//        return new ByteArrayResource(blob.getContent());
//    }
//
//    @Override
//    public boolean deleteFile(String fileName) {
//        Blob blob = storage.get(bucketName, fileName);
//        return blob.delete();
//    }
//
//    @Override
//    public void uploadFile(MultipartFile file) throws IOException {
//        BlobId blobId = BlobId.of(bucketName, Objects.requireNonNull(file.getOriginalFilename()));
//        BlobInfo blobInfo = BlobInfo.newBuilder(blobId)
//                .setContentType(file.getContentType())
//                .build();
//        Blob blob = storage.create(blobInfo, file.getBytes());
//
//        // Return the uploaded file name or any identifier
//    }
}

