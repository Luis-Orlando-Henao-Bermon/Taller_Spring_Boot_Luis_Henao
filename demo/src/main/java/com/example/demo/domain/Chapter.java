package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "chapters")
public class Chapter {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "numberchapter")
    private Integer numberchapter;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    
    @Column(name = "description", length = 80)
    private String description;
    
    @Column(name = "chapter_summary")
    private String chapterSummary;
    
    @ManyToOne
    @JoinColumn(name = "skill_id", insertable = false, updatable = false)
    private Skill skill;
    
    @OneToMany(mappedBy = "chapter")
    private List<SubChapter> subChapters;

    public Chapter(Integer id, Integer numberchapter, LocalDateTime createdAt, LocalDateTime updatedAt,
            String description, String chapterSummary, Skill skill, List<SubChapter> subChapters) {
        this.id = id;
        this.numberchapter = numberchapter;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.description = description;
        this.chapterSummary = chapterSummary;
        this.skill = skill;
        this.subChapters = subChapters;
    }

    
    
}
