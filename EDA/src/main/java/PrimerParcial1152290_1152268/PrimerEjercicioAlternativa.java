/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PrimerParcial1152290_1152268;

import java.util.ArrayList;
import java.util.List;

public class PrimerEjercicioAlternativa {
    public List<Integer> Fusionar(List<Integer> lista1, List<Integer> lista2) {
        List<Integer> Lista1;
        List<Integer> Lista2;
        List<Integer> rta = new ArrayList<>();

        if (lista1.size() >= lista2.size()) {
            Lista1 = lista1;
            Lista2 = lista2;
        } else {
            Lista1 = lista2;
            Lista2 = lista1;
        }

        int j = 0;
        for (int i = 0; i < Lista1.size(); i++) {
            if (j < Lista2.size()) {
                if (Lista1.get(i) < Lista2.get(j)) {
                    rta.add(Lista1.get(i));
                } else {
                    rta.add(Lista2.get(j));
                    j++;
                    i--;
                }
            } else {
                rta.add(Lista1.get(i));
            }

        }

        if (j == 0) {
            rta.addAll(Lista2);
        }

        return rta;
    }
}