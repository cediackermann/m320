package silviobraendle.n1;

import static java.util.Map.entry;
import java.util.Map;

public abstract class CharMap {
    static public final Map<Character, String[]> charMap = Map.ofEntries(
            entry('a', new String[] {
                    "    ",
                    " ## ",
                    "# # ",
                    "### ",
                    "    "
            }),
            entry('b', new String[] {
                    "#   ",
                    "### ",
                    "# # ",
                    "### ",
                    "    "
            }),
            entry('c', new String[] {
                    "    ",
                    "### ",
                    "#   ",
                    "### ",
                    "    "
            }),
            entry('d', new String[] {
                    "  # ",
                    "### ",
                    "# # ",
                    "### ",
                    "    "
            }),
            entry('e', new String[] {
                    "    ",
                    "### ",
                    "##  ",
                    "### ",
                    "    "
            }),
            entry('f', new String[] {
                    " ## ",
                    " #  ",
                    "### ",
                    " #  ",
                    "##  "
            }),
            entry('g', new String[] {
                    "    ",
                    "### ",
                    "# # ",
                    " ## ",
                    "### "
            }),
            entry('h', new String[] {
                    "#   ",
                    "### ",
                    "# # ",
                    "# # ",
                    "    "
            }),
            entry('i', new String[] {
                    " #  ",
                    "    ",
                    " #  ",
                    " ## ",
                    "    "
            }),
            entry('j', new String[] {
                    " #  ",
                    "    ",
                    " #  ",
                    " #  ",
                    "#   "
            }),
            entry('k', new String[] {
                    "#   ",
                    "# # ",
                    "##  ",
                    "# # ",
                    "    "
            }),
            entry('l', new String[] {
                    " #  ",
                    " #  ",
                    " #  ",
                    " ## ",
                    "    "
            }),
            entry('m', new String[] {
                    "    ",
                    "### ",
                    "### ",
                    "# # ",
                    "    "
            }),
            entry('n', new String[] {
                    "    ",
                    "##  ",
                    "# # ",
                    "# # ",
                    "    "
            }),
            entry('o', new String[] {
                    "    ",
                    "### ",
                    "# # ",
                    "### ",
                    "    "
            }),
            entry('p', new String[] {
                    "    ",
                    "### ",
                    "# # ",
                    "### ",
                    "#   "
            }),
            entry('q', new String[] {
                    "    ",
                    "### ",
                    "# # ",
                    "### ",
                    "  # "
            }),
            entry('r', new String[] {
                    "    ",
                    "### ",
                    "#   ",
                    "#   ",
                    "    "
            }),
            entry('s', new String[] {
                    "    ",
                    " ## ",
                    " #  ",
                    "##  ",
                    "    "
            }),
            entry('t', new String[] {
                    " #  ",
                    "### ",
                    " #  ",
                    " ## ",
                    "    "
            }),
            entry('u', new String[] {
                    "    ",
                    "# # ",
                    "# # ",
                    "### ",
                    "    "
            }),
            entry('v', new String[] {
                    "    ",
                    "# # ",
                    "# # ",
                    " #  ",
                    "    "
            }),
            entry('w', new String[] {
                    "    ",
                    "# # ",
                    "### ",
                    "### ",
                    "    "
            }),
            entry('x', new String[] {
                    "    ",
                    "# # ",
                    " #  ",
                    "# # ",
                    "    "
            }),
            entry('y', new String[] {
                    "    ",
                    "# # ",
                    "### ",
                    "  # ",
                    "### "
            }),
            entry('z', new String[] {
                    "    ",
                    "##  ",
                    " #  ",
                    " ## ",
                    "    "
            }),

            entry('A', new String[] {
                    " #  ",
                    "# # ",
                    "### ",
                    "# # ",
                    "# # "
                }),

            entry('B', new String[] {
                    "##  ",
                    "# # ",
                    "##  ",
                    "# # ",
                    "##  "
                }),

            entry('C', new String[] {
                    " ## ",
                    "#   ",
                    "#   ",
                    "#   ",
                    " ## "
                }),

            entry('D', new String[] {
                    "##  ",
                    "# # ",
                    "# # ",
                    "# # ",
                    "##  "
                }),

            entry('E', new String[] {
                    "### ",
                    "#   ",
                    "##  ",
                    "#   ",
                    "### "
                }),

            entry('F', new String[] {
                    "### ",
                    "#   ",
                    "##  ",
                    "#   ",
                    "#   "
                }),

            entry('G', new String[] {
                    " ## ",
                    "#   ",
                    "# # ",
                    "# # ",
                    " ## "
                }),

            entry('H', new String[] {
                    "# # ",
                    "# # ",
                    "### ",
                    "# # ",
                    "# # "
                }),

            entry('I', new String[] {
                    "### ",
                    " #  ",
                    " #  ",
                    " #  ",
                    "### "
                }),

            entry('J', new String[] {
                    " ## ",
                    "  # ",
                    "  # ",
                    "# # ",
                    " #  "
                }),

            entry('K', new String[] {
                    "# # ",
                    "# # ",
                    "##  ",
                    "# # ",
                    "# # "
                }),

            entry('L', new String[] {
                    "#   ",
                    "#   ",
                    "#   ",
                    "#   ",
                    "### "
                }),

            entry('M', new String[] {
                    "# # ",
                    "### ",
                    "### ",
                    "# # ",
                    "# # "
                }),

            entry('N', new String[] {
                    "### ",
                    "# # ",
                    "# # ",
                    "# # ",
                    "# # "
                }),

            entry('O', new String[] {
                    " #  ",
                    "# # ",
                    "# # ",
                    "# # ",
                    " #  "
                }),

            entry('P', new String[] {
                    "##  ",
                    "# # ",
                    "##  ",
                    "#   ",
                    "#   "
                }),

            entry('Q', new String[] {
                    " #  ",
                    "# # ",
                    "# # ",
                    " ## ",
                    "  # "
                }),

            entry('R', new String[] {
                    "##  ",
                    "# # ",
                    "##  ",
                    "# # ",
                    "# # "
                }),

            entry('S', new String[] {
                    " ## ",
                    "#   ",
                    " #  ",
                    "  # ",
                    "##  "
                }),

            entry('T', new String[] {
                    "### ",
                    " #  ",
                    " #  ",
                    " #  ",
                    " #  "
                }),

            entry('U', new String[] {
                    "# # ",
                    "# # ",
                    "# # ",
                    "# # ",
                    "### "
                }),

            entry('V', new String[] {
                    "# # ",
                    "# # ",
                    "# # ",
                    "# # ",
                    " #  "
                }),

            entry('W', new String[] {
                    "# # ",
                    "# # ",
                    "### ",
                    "### ",
                    "# # "
                }),

            entry('X', new String[] {
                    "# # ",
                    "# # ",
                    " #  ",
                    "# # ",
                    "# # "
                }),

            entry('Y', new String[] {
                    "# # ",
                    "# # ",
                    " #  ",
                    " #  ",
                    " #  "
                }),

            entry('Z', new String[] {
                    "### ",
                    "  # ",
                    " #  ",
                    "#   ",
                    "### "
                })
        );
}
