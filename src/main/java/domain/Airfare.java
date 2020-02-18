package domain;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Table (name = "airfare")
public class Airfare implements BaseEntity{

    @Id
    @GeneratedValue (generator = "airfare_seq" , strategy = GenerationType.AUTO)
    @Column(name = "id_airfare")
    private Long id;

    @ManyToMany(mappedBy = "airfares")
    List<ExtraItem> extraItem;


    @ManyToOne
    @JoinColumn(name="id_destination")
    private Destination destination;

    @Override
    public Long getId() {
        return null;
    }


}
