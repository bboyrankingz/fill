package com.bboyrankingz;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.google.common.collect.Lists.newArrayList;
import static com.google.common.collect.Maps.newHashMap;

public class Fill {

    private final Map<String, List<String>> fill = newHashMap();

    public Fill(){
    }

    public void add(Long lon, Long lat, String name)
    {
        String key = lon.toString() + lat.toString();
        if(fill.containsKey(key)){
            fill.get(key).add(name);
        } else {
            List<String> names = newArrayList();
            names.add(name);
            fill.put(key, names);
        }
    }

    public List<String> getPeopleInMyFill(String name) {
        return fill.values()
                .stream()
                .filter(names -> matchWithName(name, names))
                .flatMap(Collection::stream)
                .filter(n -> !n.contains(name))
                .collect(Collectors.toList());
    }

    private boolean matchWithName(String name, List<String> names) {
        return names.stream().anyMatch(n -> n.contains(name));
    }

}
