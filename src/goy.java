// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class goy
    implements Iterator
{

    private static final Pattern a;
    private static final Pattern b = Pattern.compile("\\d{1,5}-+\\d{1,5}\\s{0,4}\\(\\d{1,4}");
    private static final Pattern c = Pattern.compile("(?:(?:[0-3]?\\d/[01]?\\d)|(?:[01]?\\d/[0-3]?\\d))/(?:[12]\\d)?\\d{2}");
    private static final Pattern d = Pattern.compile("[12]\\d{3}[-/]?[01]\\d[-/]?[0-3]\\d +[0-2]\\d$");
    private static final Pattern e = Pattern.compile(":[0-5]\\d");
    private static final Pattern f;
    private static final Pattern g[] = {
        Pattern.compile("/+(.*)"), Pattern.compile("(\\([^(]*)"), Pattern.compile("(?:\\p{Z}-|-\\p{Z})\\p{Z}*(.+)"), Pattern.compile("[\u2012-\u2015\uFF0D]\\p{Z}*(.+)"), Pattern.compile("\\.+\\p{Z}*([^.]+)"), Pattern.compile("\\p{Z}+(\\P{Z}+)")
    };
    private static final Pattern h;
    private final gpb i;
    private final CharSequence j;
    private final String k;
    private final gpd l;
    private long m;
    private int n;
    private gox o;
    private int p;

    private gox a(String s, int i1)
    {
        if (!f.matcher(s).matches())
        {
            break MISSING_BLOCK_LABEL_258;
        }
        if (b.matcher(s).find())
        {
            return null;
        }
        if (l.compareTo(gpd.b) < 0)
        {
            break MISSING_BLOCK_LABEL_133;
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_85;
        }
        if (!h.matcher(s).lookingAt())
        {
            char c1 = j.charAt(i1 - 1);
            if (b(c1) || a(c1))
            {
                break MISSING_BLOCK_LABEL_258;
            }
        }
        int j1 = s.length() + i1;
        if (j1 < j.length())
        {
            char c2 = j.charAt(j1);
            if (b(c2) || a(c2))
            {
                break MISSING_BLOCK_LABEL_258;
            }
        }
        gpw gpw1;
        gpw1 = i.b(s, k);
        if (!i.b(gpw1.a()).equals("IL") || i.a(gpw1).length() != 4)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        if (i1 <= 0)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        if (j.charAt(i1 - 1) != '*')
        {
            break MISSING_BLOCK_LABEL_258;
        }
        if (!l.a(gpw1, s, i))
        {
            break MISSING_BLOCK_LABEL_258;
        }
        gpw1.l();
        gpw1.j();
        gpw1.m();
        s = new gox(i1, s, gpw1);
        return s;
        s;
        return null;
    }

    private static CharSequence a(Pattern pattern, CharSequence charsequence)
    {
        Matcher matcher = pattern.matcher(charsequence);
        pattern = charsequence;
        if (matcher.find())
        {
            pattern = charsequence.subSequence(0, matcher.start());
        }
        return pattern;
    }

    private static String a(int i1, int j1)
    {
        if (i1 < 0 || j1 <= 0 || j1 < i1)
        {
            throw new IllegalArgumentException();
        } else
        {
            return (new StringBuilder(25)).append("{").append(i1).append(",").append(j1).append("}").toString();
        }
    }

    private static boolean a(char c1)
    {
        Character.UnicodeBlock unicodeblock;
        if (Character.isLetter(c1) || Character.getType(c1) == 6)
        {
            if ((unicodeblock = Character.UnicodeBlock.of(c1)).equals(Character.UnicodeBlock.BASIC_LATIN) || unicodeblock.equals(Character.UnicodeBlock.LATIN_1_SUPPLEMENT) || unicodeblock.equals(Character.UnicodeBlock.LATIN_EXTENDED_A) || unicodeblock.equals(Character.UnicodeBlock.LATIN_EXTENDED_ADDITIONAL) || unicodeblock.equals(Character.UnicodeBlock.LATIN_EXTENDED_B) || unicodeblock.equals(Character.UnicodeBlock.COMBINING_DIACRITICAL_MARKS))
            {
                return true;
            }
        }
        return false;
    }

    static boolean a(gpb gpb1, gpw gpw1, StringBuilder stringbuilder, String as[])
    {
        int i1;
        int j1;
        boolean flag;
        if (gpw1.k() != gpx.d)
        {
            String s = Integer.toString(gpw1.a());
            i1 = stringbuilder.indexOf(s);
            i1 = s.length() + i1;
        } else
        {
            i1 = 0;
        }
        flag = false;
        j1 = i1;
        for (i1 = ((flag) ? 1 : 0); i1 < as.length; i1++)
        {
            j1 = stringbuilder.indexOf(as[i1], j1);
            if (j1 < 0)
            {
                return false;
            }
            j1 += as[i1].length();
            if (i1 == 0 && j1 < stringbuilder.length() && gpb1.f(gpb1.b(gpw1.a())) != null && Character.isDigit(stringbuilder.charAt(j1)))
            {
                gpb1 = gpb1.a(gpw1);
                return stringbuilder.substring(j1 - as[i1].length()).startsWith(gpb1);
            }
        }

        return stringbuilder.substring(j1).contains(gpw1.d());
    }

    static boolean a(gpw gpw1, gpb gpb1)
    {
        gpq gpq1;
        if (gpw1.k() == gpx.d)
        {
            if ((gpq1 = gpb1.d(gpb1.b(gpw1.a()))) != null)
            {
                Object obj = gpb1.a(gpw1);
                obj = gpb1.a(gpq1.x(), ((String) (obj)));
                if (obj != null && ((gpo) (obj)).d().length() > 0 && !((gpo) (obj)).e() && !gpb.c(((gpo) (obj)).d()))
                {
                    return gpb1.a(new StringBuilder(gpb.b(gpw1.i())), gpq1, null);
                }
            }
        }
        return true;
    }

    static boolean a(gpw gpw1, String s)
    {
        int i1 = s.indexOf('/');
        int j1;
        if (i1 >= 0)
        {
            if ((j1 = s.indexOf('/', i1 + 1)) >= 0)
            {
                boolean flag;
                if (gpw1.k() == gpx.a || gpw1.k() == gpx.c)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && gpb.b(s.substring(0, i1)).equals(Integer.toString(gpw1.a())))
                {
                    return s.substring(j1 + 1).contains("/");
                } else
                {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean a(gpw gpw1, String s, gpb gpb1)
    {
        int i1 = 0;
_L7:
        if (i1 >= s.length() - 1) goto _L2; else goto _L1
_L1:
        int j1;
        char c1 = s.charAt(i1);
        if (c1 != 'x')
        {
            j1 = i1;
            if (c1 != 'X')
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        j1 = s.charAt(i1 + 1);
        if (j1 != 120 && j1 != 88) goto _L4; else goto _L3
_L3:
        i1++;
        j1 = i1;
        if (gpb1.b(gpw1, s.substring(i1)) == gpk.d)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        return false;
_L4:
        if (!gpb.b(s.substring(i1)).equals(gpw1.d())) goto _L6; else goto _L5
_L5:
        j1 = i1;
        i1 = j1 + 1;
          goto _L7
_L2:
        return true;
    }

    static boolean a(gpw gpw1, String s, gpb gpb1, goz goz1)
    {
label0:
        {
            s = gpb.a(s, true);
            if (goz1.a(gpb1, gpw1, s, a(gpb1, gpw1, ((gpo) (null)))))
            {
                return true;
            }
            Object obj = gos.a(gpw1.a());
            if (obj == null)
            {
                break label0;
            }
            obj = ((gpq) (obj)).x().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!goz1.a(gpb1, gpw1, s, a(gpb1, gpw1, (gpo)((Iterator) (obj)).next())));
            return true;
        }
        return false;
    }

    private static String[] a(gpb gpb1, gpw gpw1, gpo gpo1)
    {
        if (gpo1 == null)
        {
            gpb1 = gpb1.a(gpw1, gpl.d);
            int j1 = gpb1.indexOf(';');
            int i1 = j1;
            if (j1 < 0)
            {
                i1 = gpb1.length();
            }
            return gpb1.substring(gpb1.indexOf('-') + 1, i1).split("-");
        } else
        {
            return gpb1.a(gpb1.a(gpw1), gpo1, gpl.d).split("-");
        }
    }

    private static boolean b(char c1)
    {
        return c1 == '%' || Character.getType(c1) == 26;
    }

    static boolean b(gpb gpb1, gpw gpw1, StringBuilder stringbuilder, String as[])
    {
        stringbuilder = gpb.f.split(stringbuilder.toString());
        int i1;
        if (gpw1.c())
        {
            i1 = stringbuilder.length - 2;
        } else
        {
            i1 = stringbuilder.length - 1;
        }
        if (stringbuilder.length == 1 || stringbuilder[i1].contains(gpb1.a(gpw1)))
        {
            return true;
        }
        int j1 = as.length;
        for (j1--; j1 > 0 && i1 >= 0; i1--)
        {
            if (!stringbuilder[i1].equals(as[j1]))
            {
                return false;
            }
            j1--;
        }

        return i1 >= 0 && stringbuilder[i1].endsWith(as[0]);
    }

    public boolean hasNext()
    {
        if (n != gpa.a) goto _L2; else goto _L1
_L1:
        Matcher matcher;
        int i1;
        i1 = p;
        matcher = a.matcher(j);
_L16:
        CharSequence charsequence1;
        int j1;
        if (m <= 0L || !matcher.find(i1))
        {
            break MISSING_BLOCK_LABEL_400;
        }
        j1 = matcher.start();
        CharSequence charsequence = j.subSequence(j1, matcher.end());
        charsequence1 = a(gpb.c, charsequence);
        if (c.matcher(charsequence1).find()) goto _L4; else goto _L3
_L3:
        if (!d.matcher(charsequence1).find()) goto _L6; else goto _L5
_L5:
        Object obj = j.toString().substring(charsequence1.length() + j1);
        if (e.matcher(((CharSequence) (obj))).lookingAt()) goto _L4; else goto _L6
_L6:
        String s;
        s = charsequence1.toString();
        obj = a(s, j1);
        if (obj == null) goto _L8; else goto _L7
_L7:
        if (obj == null) goto _L10; else goto _L9
_L9:
        o = ((gox) (obj));
        gox gox1;
        Pattern apattern[];
        Matcher matcher1;
        boolean flag;
        boolean flag1;
        int k1;
        if (o == null)
        {
            n = gpa.c;
        } else
        {
            p = o.a();
            n = gpa.b;
        }
_L2:
        return n == gpa.b;
_L8:
        apattern = g;
        k1 = apattern.length;
        i1 = 0;
_L15:
        if (i1 >= k1) goto _L4; else goto _L11
_L11:
        matcher1 = apattern[i1].matcher(s);
        flag = true;
_L14:
        if (!matcher1.find() || m <= 0L)
        {
            break MISSING_BLOCK_LABEL_361;
        }
        flag1 = flag;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_306;
        }
        gox1 = a(a(gpb.d, s.substring(0, matcher1.start())).toString(), j1);
        obj = gox1;
        if (gox1 != null) goto _L7; else goto _L12
_L12:
        m = m - 1L;
        flag1 = false;
        obj = a(a(gpb.d, matcher1.group(1)).toString(), matcher1.start(1) + j1);
        if (obj == null) goto _L13; else goto _L7
_L13:
        m = m - 1L;
        flag = flag1;
          goto _L14
        i1++;
          goto _L15
_L4:
        obj = null;
          goto _L7
_L10:
        i1 = charsequence1.length() + j1;
        m = m - 1L;
          goto _L16
        obj = null;
          goto _L9
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            gox gox1 = o;
            o = null;
            n = gpa.a;
            return gox1;
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    static 
    {
        String s = String.valueOf(String.valueOf("(\\[\uFF08\uFF3B"));
        String s1 = String.valueOf(String.valueOf(")\\]\uFF09\uFF3D"));
        String s7 = (new StringBuilder(s.length() + 3 + s1.length())).append("[^").append(s).append(s1).append("]").toString();
        String s8 = a(0, 3);
        s = String.valueOf(String.valueOf("(\\[\uFF08\uFF3B"));
        s1 = String.valueOf(String.valueOf(s7));
        String s2 = String.valueOf(String.valueOf(")\\]\uFF09\uFF3D"));
        String s3 = String.valueOf(String.valueOf(s7));
        String s4 = String.valueOf(String.valueOf("(\\[\uFF08\uFF3B"));
        String s5 = String.valueOf(String.valueOf(s7));
        String s6 = String.valueOf(String.valueOf(")\\]\uFF09\uFF3D"));
        s8 = String.valueOf(String.valueOf(s8));
        s7 = String.valueOf(String.valueOf(s7));
        f = Pattern.compile((new StringBuilder(s.length() + 26 + s1.length() + s2.length() + s3.length() + s4.length() + s5.length() + s6.length() + s8.length() + s7.length())).append("(?:[").append(s).append("])?(?:").append(s1).append("+[").append(s2).append("])?").append(s3).append("+(?:[").append(s4).append("]").append(s5).append("+[").append(s6).append("])").append(s8).append(s7).append("*").toString());
        s4 = a(0, 2);
        s1 = a(0, 4);
        s3 = a(0, 20);
        s = String.valueOf("[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]");
        s1 = String.valueOf(s1);
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        s1 = String.valueOf(a(1, 20));
        if (s1.length() != 0)
        {
            s1 = "\\p{Nd}".concat(s1);
        } else
        {
            s1 = new String("\\p{Nd}");
        }
        s2 = String.valueOf("(\\[\uFF08\uFF3B");
        s5 = String.valueOf("+\uFF0B");
        if (s5.length() != 0)
        {
            s2 = s2.concat(s5);
        } else
        {
            s2 = new String(s2);
        }
        s2 = String.valueOf(String.valueOf(s2));
        s2 = (new StringBuilder(s2.length() + 2)).append("[").append(s2).append("]").toString();
        h = Pattern.compile(s2);
        s2 = String.valueOf(String.valueOf(s2));
        s5 = String.valueOf(String.valueOf(s));
        s4 = String.valueOf(String.valueOf(s4));
        s6 = String.valueOf(String.valueOf(s1));
        s = String.valueOf(String.valueOf(s));
        s1 = String.valueOf(String.valueOf(s1));
        s3 = String.valueOf(String.valueOf(s3));
        s7 = String.valueOf(String.valueOf(gpb.e));
        a = Pattern.compile((new StringBuilder(s2.length() + 13 + s5.length() + s4.length() + s6.length() + s.length() + s1.length() + s3.length() + s7.length())).append("(?:").append(s2).append(s5).append(")").append(s4).append(s6).append("(?:").append(s).append(s1).append(")").append(s3).append("(?:").append(s7).append(")?").toString(), 66);
    }
}
