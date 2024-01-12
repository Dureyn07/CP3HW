package edu.estu;

import java.util.EnumMap;
import java.util.Map;

public class App {

    // Using wildcards <?>
    public static void incrementCountMapWildcard(Map<Enum<?>, Integer> map, Enum<?> key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    // Using type parameters <E>
    public static <E extends Enum<E>> void incrementCountMapGenerics(Map<E, Integer> map, E key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    // Example usage:
    public static void main(String[] args) {
        // Example with wildcards
        Map<Enum<?>, Integer> wildcardMap = new EnumMap<>(Direction.class);
        incrementCountMapWildcard(wildcardMap, Direction.NORTH);

        // Example with type parameters
        EnumMap<Direction, Integer> genericsMap = new EnumMap<>(Direction.class);
        incrementCountMapGenerics(genericsMap, Direction.NORTH);
    }

    enum Direction {
        NORTH, SOUTH, EAST, WEST
    }

    // Additional method as per your request
    public static <E extends Enum<E>> void incrementCountMapEnumDescG(Map<Enum.EnumDesc<E>, Integer> map, Enum.EnumDesc<E> key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }

    // Additional method as per your request
    public static void incrementCountMapEnumDescW(Map<Enum.EnumDesc<?>, Integer> map, Enum.EnumDesc<?> key) {
        map.put(key, map.getOrDefault(key, 0) + 1);
    }
}