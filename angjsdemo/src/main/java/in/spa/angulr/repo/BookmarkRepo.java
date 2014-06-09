package in.spa.angulr.repo;

import in.spa.angulr.domain.Bookmark;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookmarkRepo extends JpaRepository<Bookmark, Long> {

}
