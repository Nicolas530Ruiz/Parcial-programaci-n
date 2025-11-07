package com.library;
import java.util.*;
public class Inventory {
    private Map<String, Material> materials = new LinkedHashMap<>();
    public void addMaterial(Material m) { materials.put(m.getId(), m); }
    public Material getMaterial(String id) { return materials.get(id); }
    public Collection<Material> listAll() { return materials.values(); }
    public List<Material> listAvailable() {
        List<Material> res = new ArrayList<>();
        for (Material m : materials.values()) if (m.isAvailable()) res.add(m);
        return res;
    }
}

git commit -m "Esto es una clase Java Inventory que gestiona un catálogo de materiales usando un Map, permitiendo añadirlos, buscarlos y listarlos (todos o solo los disponibles)."
