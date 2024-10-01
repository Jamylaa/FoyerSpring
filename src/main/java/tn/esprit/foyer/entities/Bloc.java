package tn.esprit.foyer.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bloc {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long idBloc;
    private String nomBloc;
    private Long capaciteBlog;

    @OneToMany(mappedBy ="Bloc" )
    private List<Chambre> chambre;

    @ManyToOne()
    private Foyer foyer;
}
