package com.example.demo.repository;

import com.example.demo.entity.RelatedAccountsXref;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import java.util.UUID;

@RepositoryRestResource(collectionResourceRel = "related-accounts", path = "related-accounts")
public interface RelatedAccountsXrefRepository extends JpaRepository<RelatedAccountsXref, Long> {
}
