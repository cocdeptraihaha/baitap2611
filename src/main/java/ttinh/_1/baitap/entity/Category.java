package ttinh._1.baitap.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name = "categories")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @ElementCollection
    private List<String> images = new ArrayList<>();

    @ManyToMany(mappedBy = "categories")
    private List<User> users = new ArrayList<>();
}
