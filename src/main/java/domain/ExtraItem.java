package domain;

import javax.persistence.*;
import java.util.List;

@Entity
@Table( name = "extra_item")
public class ExtraItem implements BaseEntity {

    @Id()
    @GeneratedValue( generator = "extra_item_seq", strategy = GenerationType.AUTO)
    @Column( name = "id_extra_item")
    private Long id;

    @ManyToMany( cascade = { CascadeType.ALL })
    @JoinTable(
            name = "extra_item_airfare",
            joinColumns = { @JoinColumn(name = "id_extra_item") },
            inverseJoinColumns = { @JoinColumn(name = "id_airfare") }
    )
    List<Airfare> airfares;

    @Column( name = "item_name")
    private String itemName;

    @Column (name = "price")
    private Double price;

    @Override
    public Long getId() {
        return null;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public ExtraItem(String itemName, Double price) {
        this.itemName = itemName;
        this.price = price;
    }
    public ExtraItem() {
    }
}
