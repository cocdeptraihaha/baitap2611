package ttinh._1.baitap.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer quantity;

    @Column(length = 1000)
    private String desc;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
}
