/**.
 * Displays Hello World.
 * @author Van
 * @version 1.0
 * @since 2024/02/09
 */
package com.example;

public final class HelloWorldStyle {
    /**
     * This is a private constructor used to satisfy the linter.
     * @exception IllegalStateException Utility class.
     * @see IllegalStateException
     */
    private HelloWorldStyle() {
        throw new IllegalStateException("Utility class");
    }
  /**
   * Javadoc.
   *
   * @param args Unused
   */
  public static void main(final String[] args) {
    System.out.println("Hello World (with style)!");
  }
}
