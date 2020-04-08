package com.videolibrary.zipcode.fullstackapp.services;

import com.videolibrary.zipcode.fullstackapp.models.Video;
import com.videolibrary.zipcode.fullstackapp.repositories.VideoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//<<<<<<< HEAD
//=======
//import java.util.List;
//
//>>>>>>> 242ed61167719bf0ed6782dbbd56132d288ff63f
@Service
public class VideoService {

    private VideoRepository videoRepository;

    @Autowired
//<<<<<<< HEAD
    public VideoService (VideoRepository videoRepository) {
        this.videoRepository = videoRepository;
    }

    public Video addVideo (Video video) {
        return videoRepository.save(video);
    }

    public Video getVideoById (long id) {
        return videoRepository.getVideoById ( id );
    }

    public Iterable<Video> getVideoList() {
        return videoRepository.findAll ();
    }

    public Boolean deleteVideo (long id) {
        videoRepository.deleteById ( id );
        return true;
    }
//=======
//    public VideoService(VideoRepository videoRepository) {
//        this.videoRepository = videoRepository;
//    }
//
//    public Video create(Video v) {
//        return videoRepository.save(v);
//    }
//
//    public Video show(Long id) {
//        return videoRepository.getVideoById(id);
//    }
//
//    public List<Video> index() {
//        return videoRepository.findAll();
//    }
//
//    public Video update(Long id, Video v) {
//        Video video = videoRepository.getVideoById(id);
//        video.setContent(v.getContent());
//        video.setDetails(v.getDetails());
//        video.setTitle(v.getTitle());
//        videoRepository.save(video);
//        return video;
//    }
//
//    public boolean delete(Long id) {
//        videoRepository.deleteById(id);
//        return true;
//    }
//
//
//>>>>>>> 242ed61167719bf0ed6782dbbd56132d288ff63f
}
