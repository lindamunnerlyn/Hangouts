// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class gks
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
    private final gkv i;
    private final CharSequence j;
    private final String k;
    private final gkx l;
    private long m;
    private int n;
    private gkr o;
    private int p;

    private gkr a(String s, int i1)
    {
        if (!f.matcher(s).matches())
        {
            break MISSING_BLOCK_LABEL_258;
        }
        if (b.matcher(s).find())
        {
            return null;
        }
        if (l.compareTo(gkx.b) < 0)
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
        glq glq1;
        glq1 = i.b(s, k);
        if (!i.b(glq1.a()).equals("IL") || i.a(glq1).length() != 4)
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
        if (!l.a(glq1, s, i))
        {
            break MISSING_BLOCK_LABEL_258;
        }
        glq1.l();
        glq1.j();
        glq1.m();
        s = new gkr(i1, s, glq1);
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

    static boolean a(gkv gkv1, glq glq1, StringBuilder stringbuilder, String as[])
    {
        int i1;
        int j1;
        boolean flag;
        if (glq1.k() != glr.d)
        {
            String s = Integer.toString(glq1.a());
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
            if (i1 == 0 && j1 < stringbuilder.length() && gkv1.f(gkv1.b(glq1.a())) != null && Character.isDigit(stringbuilder.charAt(j1)))
            {
                gkv1 = gkv1.a(glq1);
                return stringbuilder.substring(j1 - as[i1].length()).startsWith(gkv1);
            }
        }

        return stringbuilder.substring(j1).contains(glq1.d());
    }

    static boolean a(glq glq1, gkv gkv1)
    {
        glk glk1;
        if (glq1.k() == glr.d)
        {
            if ((glk1 = gkv1.d(gkv1.b(glq1.a()))) != null)
            {
                Object obj = gkv1.a(glq1);
                obj = gkv1.a(glk1.x(), ((String) (obj)));
                if (obj != null && ((gli) (obj)).d().length() > 0 && !((gli) (obj)).e() && !gkv.c(((gli) (obj)).d()))
                {
                    return gkv1.a(new StringBuilder(gkv.b(glq1.i())), glk1, null);
                }
            }
        }
        return true;
    }

    static boolean a(glq glq1, String s)
    {
        int i1 = s.indexOf('/');
        int j1;
        if (i1 >= 0)
        {
            if ((j1 = s.indexOf('/', i1 + 1)) >= 0)
            {
                boolean flag;
                if (glq1.k() == glr.a || glq1.k() == glr.c)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag && gkv.b(s.substring(0, i1)).equals(Integer.toString(glq1.a())))
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

    static boolean a(glq glq1, String s, gkv gkv1)
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
        if (gkv1.b(glq1, s.substring(i1)) == gle.d)
        {
            continue; /* Loop/switch isn't completed */
        }
_L6:
        return false;
_L4:
        if (!gkv.b(s.substring(i1)).equals(glq1.d())) goto _L6; else goto _L5
_L5:
        j1 = i1;
        i1 = j1 + 1;
          goto _L7
_L2:
        return true;
    }

    static boolean a(glq glq1, String s, gkv gkv1, gkt gkt1)
    {
label0:
        {
            s = gkv.a(s, true);
            if (gkt1.a(gkv1, glq1, s, a(gkv1, glq1, ((gli) (null)))))
            {
                return true;
            }
            Object obj = gkm.a(glq1.a());
            if (obj == null)
            {
                break label0;
            }
            obj = ((glk) (obj)).x().iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
            } while (!gkt1.a(gkv1, glq1, s, a(gkv1, glq1, (gli)((Iterator) (obj)).next())));
            return true;
        }
        return false;
    }

    private static String[] a(gkv gkv1, glq glq1, gli gli1)
    {
        if (gli1 == null)
        {
            gkv1 = gkv1.a(glq1, glf.d);
            int j1 = gkv1.indexOf(';');
            int i1 = j1;
            if (j1 < 0)
            {
                i1 = gkv1.length();
            }
            return gkv1.substring(gkv1.indexOf('-') + 1, i1).split("-");
        } else
        {
            return gkv1.a(gkv1.a(glq1), gli1, glf.d).split("-");
        }
    }

    private static boolean b(char c1)
    {
        return c1 == '%' || Character.getType(c1) == 26;
    }

    static boolean b(gkv gkv1, glq glq1, StringBuilder stringbuilder, String as[])
    {
        stringbuilder = gkv.f.split(stringbuilder.toString());
        int i1;
        if (glq1.c())
        {
            i1 = stringbuilder.length - 2;
        } else
        {
            i1 = stringbuilder.length - 1;
        }
        if (stringbuilder.length == 1 || stringbuilder[i1].contains(gkv1.a(glq1)))
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
        if (n != gku.a) goto _L2; else goto _L1
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
        charsequence1 = a(gkv.c, charsequence);
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
        o = ((gkr) (obj));
        gkr gkr1;
        Pattern apattern[];
        Matcher matcher1;
        boolean flag;
        boolean flag1;
        int k1;
        if (o == null)
        {
            n = gku.c;
        } else
        {
            p = o.a();
            n = gku.b;
        }
_L2:
        return n == gku.b;
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
        gkr1 = a(a(gkv.d, s.substring(0, matcher1.start())).toString(), j1);
        obj = gkr1;
        if (gkr1 != null) goto _L7; else goto _L12
_L12:
        m = m - 1L;
        flag1 = false;
        obj = a(a(gkv.d, matcher1.group(1)).toString(), matcher1.start(1) + j1);
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
            gkr gkr1 = o;
            o = null;
            n = gku.a;
            return gkr1;
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    static 
    {
        String s = (new StringBuilder(String.valueOf("(\\[\uFF08\uFF3B").length() + 3 + String.valueOf(")\\]\uFF09\uFF3D").length())).append("[^").append("(\\[\uFF08\uFF3B").append(")\\]\uFF09\uFF3D").append("]").toString();
        String s1 = a(0, 3);
        f = Pattern.compile((new StringBuilder(String.valueOf("(\\[\uFF08\uFF3B").length() + 26 + String.valueOf(s).length() + String.valueOf(")\\]\uFF09\uFF3D").length() + String.valueOf(s).length() + String.valueOf("(\\[\uFF08\uFF3B").length() + String.valueOf(s).length() + String.valueOf(")\\]\uFF09\uFF3D").length() + String.valueOf(s1).length() + String.valueOf(s).length())).append("(?:[").append("(\\[\uFF08\uFF3B").append("])?(?:").append(s).append("+[").append(")\\]\uFF09\uFF3D").append("])?").append(s).append("+(?:[").append("(\\[\uFF08\uFF3B").append("]").append(s).append("+[").append(")\\]\uFF09\uFF3D").append("])").append(s1).append(s).append("*").toString());
        String s3 = a(0, 2);
        s1 = a(0, 4);
        String s4 = a(0, 20);
        s = String.valueOf("[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]");
        s1 = String.valueOf(s1);
        String s2;
        String s5;
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
        s2 = (new StringBuilder(String.valueOf(s2).length() + 2)).append("[").append(s2).append("]").toString();
        h = Pattern.compile(s2);
        s5 = gkv.e;
        a = Pattern.compile((new StringBuilder(String.valueOf(s2).length() + 13 + String.valueOf(s).length() + String.valueOf(s3).length() + String.valueOf(s1).length() + String.valueOf(s).length() + String.valueOf(s1).length() + String.valueOf(s4).length() + String.valueOf(s5).length())).append("(?:").append(s2).append(s).append(")").append(s3).append(s1).append("(?:").append(s).append(s1).append(")").append(s4).append("(?:").append(s5).append(")?").toString(), 66);
    }
}
