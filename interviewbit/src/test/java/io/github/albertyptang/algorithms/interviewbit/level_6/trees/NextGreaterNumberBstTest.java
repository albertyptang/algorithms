package io.github.albertyptang.algorithms.interviewbit.level_6.trees;

import org.junit.Test;

import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNode;
import io.github.albertyptang.algorithms.interviewbit.level_6.trees.domain.TreeNodeBuilder;

import static org.junit.Assert.assertEquals;

/**
 * @author atang
 */
public class NextGreaterNumberBstTest {
    @Test
    public void getSuccessor() throws Exception {
        final TreeNode tree = TreeNodeBuilder.build(100, 98, 102, 96, 99, -1, -1, -1, 97);
        assertEquals(97, NextGreaterNumberBst.getSuccessor(tree, 96).val);
        assertEquals(98, NextGreaterNumberBst.getSuccessor(tree, 97).val);
        assertEquals(99, NextGreaterNumberBst.getSuccessor(tree, 98).val);
        assertEquals(100, NextGreaterNumberBst.getSuccessor(tree, 99).val);
        assertEquals(102, NextGreaterNumberBst.getSuccessor(tree, 100).val);
        assertEquals(null, NextGreaterNumberBst.getSuccessor(tree, 101));
        assertEquals(null, NextGreaterNumberBst.getSuccessor(tree, 102));
        assertEquals(null, NextGreaterNumberBst.getSuccessor(tree, 95));

        final TreeNode tree2 = TreeNodeBuilder.build(2119, 280, 2140, 34, 1714, 2134, 2143, 16, 277, 1549, 1813, 2131, 2137, -1, 2158, 4, 25, 43, -1, 1516, 1672, 1747, 1819, 2122, -1, -1, -1, 2146, -1, 1, 13, 22, 31, 37, 61, 673, 1522, 1615, 1696, 1741, 1777, 1816, 2005, -1, 2128, -1, 2152, -1, -1, 10, -1, 19, -1, 28, -1, -1, 40, 52, 238, 469, 856, 1519, 1540, 1591, 1657, 1690, 1708, 1735, 1744, 1774, 1783, -1, -1, 1873, 2026, 2125, -1, 2149, 2155, 7, -1, -1, -1, -1, -1, -1, -1, 49, 55, 82, 262, 349, 556, 742, 1132, -1, -1, 1528, 1546, 1588, 1606, 1621, 1663, 1687, 1693, 1705, 1711, 1720, 1738, -1, -1, 1756, -1, 1780, 1807, 1846, 2002, 2008, 2071, -1, -1, -1, -1, -1, -1, -1, -1, 46, -1, -1, 58, 70, 148, 256, 271, 325, 352, 502, 568, 715, 841, 1123, 1423, 1525, 1534, 1543, -1, 1558, -1, 1597, 1609, 1618, 1636, 1660, 1666, 1684, -1, -1, -1, 1702, -1, -1, -1, 1717, 1723, -1, -1, 1750, 1759, -1, -1, 1798, 1810, 1834, 1855, 1930, -1, -1, 2017, 2059, 2089, -1, -1, -1, -1, 67, 73, 118, 202, 241, 259, 265, 274, 286, 334, -1, 460, 478, 553, 565, 652, 712, 727, 814, 847, 883, 1126, 1270, 1483, -1, -1, 1531, 1537, -1, -1, 1552, 1576, 1594, 1603, -1, 1612, -1, -1, 1627, 1639, -1, -1, -1, 1669, 1675, -1, 1699, -1, -1, -1, -1, 1732, -1, 1753, -1, 1771, 1792, 1804, -1, -1, 1825, 1843, 1852, 1870, 1921, 1963, 2014, 2020, 2044, 2062, 2086, 2095, 64, -1, -1, 76, 85, 124, 166, 208, -1, 253, -1, -1, -1, 268, -1, -1, 283, 298, 328, 340, 388, 463, 475, 493, 514, -1, 562, -1, 598, 664, 694, -1, 724, 730, 799, 829, 844, 850, 859, 1111, -1, 1129, 1231, 1339, 1450, 1501, -1, -1, -1, -1, -1, 1555, 1573, 1582, -1, -1, 1600, -1, -1, -1, 1624, 1633, -1, 1654, -1, -1, -1, 1678, -1, -1, 1726, -1, -1, -1, 1768, -1, 1789, 1795, 1801, -1, 1822, 1828, 1840, -1, 1849, -1, 1858, -1, 1903, 1927, 1939, 1987, 2011, -1, -1, 2023, 2035, 2050, -1, 2068, 2080, -1, 2092, 2101, -1, -1, -1, 79, -1, 100, 121, 145, 157, 190, 205, 211, 244, -1, -1, -1, -1, -1, 295, 313, -1, 331, 337, 343, 355, 424, -1, 466, 472, -1, 481, 496, 508, 517, 559, -1, 589, 628, 655, 670, 676, 706, 721, -1, -1, 739, 790, 805, 817, 838, -1, -1, -1, 853, -1, 862, 1003, 1114, -1, -1, 1207, 1264, 1333, 1393, 1444, 1468, 1498, 1504, -1, -1, 1561, -1, 1579, 1585, -1, -1, -1, -1, 1630, -1, 1645, -1, -1, 1681, -1, 1729, 1762, -1, 1786, -1, -1, -1, -1, -1, -1, -1, -1, 1831, 1837, -1, -1, -1, -1, 1867, 1885, 1918, 1924, -1, 1933, 1945, 1966, 1993, -1, -1, -1, -1, 2032, 2041, 2047, 2053, 2065, -1, 2077, 2083, -1, -1, 2098, 2110, -1, -1, 97, 115, -1, -1, 127, -1, 151, 163, 172, 193, -1, -1, -1, 235, -1, 250, 289, -1, 301, 322, -1, -1, -1, -1, -1, 346, -1, 367, 415, 427, -1, -1, -1, -1, -1, 487, -1, 499, 505, 511, -1, 550, -1, -1, 574, 592, 601, 649, -1, 661, 667, -1, -1, 679, 703, 709, 718, -1, 733, -1, 781, 793, 802, 808, -1, 820, 832, -1, -1, -1, -1, 868, 904, 1078, -1, 1120, 1189, 1213, 1246, 1267, 1318, 1336, 1375, 1405, 1429, 1447, 1462, 1480, 1489, -1, -1, 1513, -1, 1564, -1, -1, -1, -1, -1, -1, 1642, 1648, -1, -1, -1, -1, -1, 1765, -1, -1, -1, -1, -1, -1, 1864, -1, 1879, 1900, 1912, -1, -1, -1, -1, 1936, 1942, 1954, -1, 1972, 1990, 1996, 2029, -1, 2038, -1, -1, -1, -1, 2056, -1, -1, 2074, -1, -1, -1, -1, -1, 2107, 2113, 91, -1, 112, -1, -1, 130, -1, 154, 160, -1, 169, 184, -1, 199, 226, -1, 247, -1, -1, 292, -1, 310, 316, -1, -1, -1, 364, 373, 406, 421, -1, 442, 484, 490, -1, -1, -1, -1, -1, -1, 526, -1, 571, 577, -1, 595, -1, 607, 640, -1, 658, -1, -1, -1, -1, 688, 700, -1, -1, -1, -1, -1, -1, 736, 775, 787, -1, 796, -1, -1, -1, 811, -1, 823, -1, 835, 865, 874, 898, 982, 1009, 1108, 1117, -1, 1135, 1201, 1210, 1222, 1240, 1252, -1, -1, 1276, 1324, -1, -1, 1357, 1390, 1402, 1417, 1426, 1432, -1, -1, 1453, 1465, 1474, -1, 1486, 1492, 1510, -1, -1, 1567, -1, -1, -1, 1651, -1, -1, 1861, -1, 1876, 1882, 1894, -1, 1909, 1915, -1, -1, -1, -1, 1948, 1957, 1969, 1978, -1, -1, -1, 1999, -1, -1, -1, -1, -1, -1, -1, -1, 2104, -1, -1, 2116, 88, 94, 103, -1, -1, 133, -1, -1, -1, -1, -1, -1, 178, 187, 196, -1, 214, 229, -1, -1, -1, -1, 304, -1, -1, 319, 358, -1, 370, 379, 403, 412, 418, -1, 430, 451, -1, -1, -1, -1, 523, 535, -1, -1, -1, 580, -1, -1, 604, 613, 634, 643, -1, -1, 685, 691, 697, -1, -1, -1, 760, 778, 784, -1, -1, -1, -1, -1, -1, 826, -1, -1, -1, -1, 871, 877, 889, 901, 907, 1000, 1006, 1015, 1087, -1, -1, -1, -1, 1174, 1198, 1204, -1, -1, 1219, 1228, 1234, 1243, 1249, 1258, 1273, 1300, 1321, 1327, 1342, 1366, 1384, -1, 1399, -1, 1408, 1420, -1, -1, -1, 1438, -1, 1459, -1, -1, 1471, 1477, -1, -1, -1, 1495, 1507, -1, -1, 1570, -1, -1, -1, -1, -1, -1, -1, -1, 1891, 1897, 1906, -1, -1, -1, -1, 1951, -1, 1960, -1, -1, 1975, 1984, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 106, -1, 139, 175, 181, -1, -1, -1, -1, -1, 220, -1, 232, -1, 307, -1, -1, -1, 361, -1, -1, 376, 385, 400, -1, 409, -1, -1, -1, -1, 436, 448, 454, 520, -1, 532, 541, -1, 586, -1, -1, 610, 616, 631, 637, -1, 646, 682, -1, -1, -1, -1, -1, 757, 766, -1, -1, -1, -1, -1, -1, -1, -1, -1, 880, 886, 895, -1, -1, -1, 919, 994, -1, -1, -1, 1012, 1060, 1084, 1105, 1162, 1180, 1195, -1, -1, -1, 1216, -1, 1225, -1, -1, 1237, -1, -1, -1, -1, 1255, 1261, -1, -1, 1285, 1309, -1, -1, -1, 1330, -1, 1345, 1363, 1369, 1378, 1387, 1396, -1, -1, 1414, -1, -1, 1435, 1441, 1456, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1888, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1981, -1, -1, 109, 136, 142, -1, -1, -1, -1, 217, 223, -1, -1, -1, -1, -1, -1, -1, -1, 382, -1, 391, -1, -1, -1, 433, 439, 445, -1, -1, 457, -1, -1, 529, -1, 538, 544, 583, -1, -1, -1, -1, 619, -1, -1, -1, -1, -1, -1, -1, -1, 748, -1, 763, 769, -1, -1, -1, -1, 892, -1, 913, 940, 988, 997, -1, -1, 1042, 1069, 1081, -1, 1090, -1, 1159, 1168, 1177, 1183, 1192, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1279, 1294, 1306, 1315, -1, -1, -1, 1354, 1360, -1, -1, 1372, -1, 1381, -1, -1, -1, -1, 1411, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 397, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 547, -1, -1, -1, 622, 745, 754, -1, -1, -1, 772, -1, -1, 910, 916, 934, 970, 985, 991, -1, -1, 1033, 1051, 1063, 1072, -1, -1, -1, 1093, 1150, -1, 1165, 1171, -1, -1, -1, 1186, -1, -1, -1, 1282, 1291, 1297, 1303, -1, 1312, -1, 1348, -1, -1, -1, -1, -1, -1, -1, -1, -1, 394, -1, -1, -1, -1, 625, -1, -1, 751, -1, -1, -1, -1, -1, -1, -1, 931, 937, 961, 973, -1, -1, -1, -1, 1027, 1039, 1045, 1054, -1, 1066, -1, 1075, -1, 1096, 1138, 1156, -1, -1, -1, -1, -1, -1, -1, -1, 1288, -1, -1, -1, -1, -1, -1, -1, -1, 1351, -1, -1, -1, -1, -1, -1, 928, -1, -1, -1, 955, 964, -1, 976, 1021, 1030, 1036, -1, -1, 1048, -1, 1057, -1, -1, -1, -1, -1, 1099, -1, 1147, 1153, -1, -1, -1, -1, -1, 925, -1, 946, 958, -1, 967, -1, 979, 1018, 1024, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1102, 1141, -1, -1, -1, 922, -1, 943, 949, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 1144, -1, -1, -1, -1, -1, 952, -1, -1, -1, -1);
        assertEquals(391, NextGreaterNumberBst.getSuccessor(tree2, 388).val);
    }
}