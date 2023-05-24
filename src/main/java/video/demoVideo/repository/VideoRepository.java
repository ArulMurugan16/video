package video.demoVideo.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import video.demoVideo.model.Video;

public interface VideoRepository extends JpaRepository<Video, Long> {
}
