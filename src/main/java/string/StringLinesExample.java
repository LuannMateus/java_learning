package string;

import java.util.stream.Collectors;

public class StringLinesExample {
  public static void main(String[] args) {
    String html = "<html>\n<head>\n</head>\n <body> \n <body> \n<html>";

    System.out.println(html.lines().map(line -> "[TAG] :: " + line).collect(Collectors.toList()));
  }

}
