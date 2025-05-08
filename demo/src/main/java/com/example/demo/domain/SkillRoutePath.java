package com.example.demo.domain;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@Table(name = "skill_route_path")
public class SkillRoutePath {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column(name = "created_at")
    private LocalDateTime createdAt;
    
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
    
    @ManyToOne
    @JoinColumn(name = "road_path_id", insertable = false, updatable = false)
    private RoadPath roadPath;
    
    @ManyToOne
    @JoinColumn(name = "skill_id", insertable = false, updatable = false)
    private Skill skill;

    public SkillRoutePath(Integer id, LocalDateTime createdAt, LocalDateTime updatedAt, RoadPath roadPath,
            Skill skill) {
        this.id = id;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.roadPath = roadPath;
        this.skill = skill;
    }

    
}
