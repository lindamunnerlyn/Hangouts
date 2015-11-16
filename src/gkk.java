// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class gkk
{

    private static final glk l = (new glk()).b("NA");
    private static final Pattern o = Pattern.compile("\\[([^\\[\\]])*\\]");
    private static final Pattern p = Pattern.compile("\\d(?=[^,}][^,}])");
    private static final Pattern q = Pattern.compile("[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]*(\\$\\d[-x\u2010-\u2015\u2212\u30FC\uFF0D-\uFF0F \240\255\u200B\u2060\u3000()\uFF08\uFF09\uFF3B\uFF3D.\\[\\]/~\u2053\u223C\uFF5E]*)+");
    private static final Pattern r = Pattern.compile("[- ]");
    private static final Pattern s = Pattern.compile("\u2008");
    private List A;
    private gls B;
    private String a;
    private StringBuilder b;
    private String c;
    private StringBuilder d;
    private StringBuilder e;
    private boolean f;
    private boolean g;
    private boolean h;
    private boolean i;
    private final gkv j = gkv.b();
    private String k;
    private glk m;
    private glk n;
    private int t;
    private int u;
    private int v;
    private StringBuilder w;
    private boolean x;
    private String y;
    private StringBuilder z;

    gkk(String s1)
    {
        a = "";
        b = new StringBuilder();
        c = "";
        d = new StringBuilder();
        e = new StringBuilder();
        f = true;
        g = false;
        h = false;
        i = false;
        t = 0;
        u = 0;
        v = 0;
        w = new StringBuilder();
        x = false;
        y = "";
        z = new StringBuilder();
        A = new ArrayList();
        B = new gls(64);
        k = s1;
        n = a(k);
        m = n;
    }

    private glk a(String s1)
    {
        int i1 = j.e(s1);
        s1 = j.b(i1);
        s1 = j.d(s1);
        if (s1 != null)
        {
            return s1;
        } else
        {
            return l;
        }
    }

    private String a(char c1, boolean flag)
    {
        char c2;
        String s1;
        boolean flag3;
        flag3 = true;
        d.append(c1);
        if (flag)
        {
            u = d.length();
        }
        boolean flag1;
        if (Character.isDigit(c1) || d.length() == 1 && gkv.b.matcher(Character.toString(c1)).matches())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1) goto _L2; else goto _L1
_L1:
        f = false;
        g = true;
        c2 = c1;
_L14:
        if (f) goto _L4; else goto _L3
_L3:
        if (!g) goto _L6; else goto _L5
_L5:
        s1 = d.toString();
_L12:
        return s1;
_L2:
        if (c1 == '+')
        {
            e.append(c1);
        } else
        {
            c1 = Character.forDigit(Character.digit(c1, 10), 10);
            e.append(c1);
            z.append(c1);
        }
        c2 = c1;
        if (flag)
        {
            v = e.length();
            c2 = c1;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        if (i())
        {
            if (j())
            {
                return d();
            }
        } else
        {
            if (y.length() > 0)
            {
                z.insert(0, y);
                int i1 = w.lastIndexOf(y);
                w.setLength(i1);
            }
            boolean flag2;
            if (!y.equals(h()))
            {
                flag2 = flag3;
            } else
            {
                flag2 = false;
            }
            if (flag2)
            {
                w.append(' ');
                return d();
            }
        }
        return d.toString();
_L4:
        e.length();
        JVM INSTR tableswitch 0 3: default 336
    //                   0 416
    //                   1 416
    //                   2 416
    //                   3 424;
           goto _L7 _L8 _L8 _L8 _L9
_L7:
        if (i)
        {
            if (j())
            {
                i = false;
            }
            s1 = String.valueOf(w);
            String s2 = String.valueOf(z.toString());
            return (new StringBuilder(String.valueOf(s1).length() + 0 + String.valueOf(s2).length())).append(s1).append(s2).toString();
        }
        break; /* Loop/switch isn't completed */
_L8:
        return d.toString();
_L9:
        if (i())
        {
            i = true;
        } else
        {
            y = h();
            return f();
        }
        if (true) goto _L7; else goto _L10
_L10:
        if (A.size() <= 0)
        {
            break; /* Loop/switch isn't completed */
        }
        String s4 = c(c2);
        String s3 = e();
        s1 = s3;
        if (s3.length() <= 0)
        {
            b(z.toString());
            if (c())
            {
                return g();
            }
            if (f)
            {
                return c(s4);
            } else
            {
                return d.toString();
            }
        }
        if (true) goto _L12; else goto _L11
_L11:
        return f();
        if (true) goto _L14; else goto _L13
_L13:
    }

    private void b(String s1)
    {
        int i1 = s1.length();
        Iterator iterator = A.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            gli gli1 = (gli)iterator.next();
            if (gli1.c() != 0)
            {
                int j1 = Math.min(i1 - 3, gli1.c() - 1);
                if (!B.a(gli1.a(j1)).matcher(s1).lookingAt())
                {
                    iterator.remove();
                }
            }
        } while (true);
    }

    private String c(char c1)
    {
        Matcher matcher = s.matcher(b);
        if (matcher.find(t))
        {
            String s1 = matcher.replaceFirst(Character.toString(c1));
            b.replace(0, s1.length(), s1);
            t = matcher.start();
            return b.substring(0, t + 1);
        }
        if (A.size() == 1)
        {
            f = false;
        }
        c = "";
        return d.toString();
    }

    private String c(String s1)
    {
        int i1 = w.length();
        if (x && i1 > 0 && w.charAt(i1 - 1) != ' ')
        {
            String s2 = new String(w);
            return (new StringBuilder(String.valueOf(s2).length() + 1 + String.valueOf(s1).length())).append(s2).append(' ').append(s1).toString();
        } else
        {
            String s3 = String.valueOf(w);
            return (new StringBuilder(String.valueOf(s3).length() + 0 + String.valueOf(s1).length())).append(s3).append(s1).toString();
        }
    }

    private boolean c()
    {
        Iterator iterator = A.iterator();
_L8:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        String s1;
        gli gli1;
        String s2;
        gli1 = (gli)iterator.next();
        s2 = gli1.a();
        if (c.equals(s2))
        {
            return false;
        }
        s1 = gli1.a();
        if (s1.indexOf('|') != -1) goto _L4; else goto _L3
_L3:
        boolean flag;
        s1 = o.matcher(s1).replaceAll("\\\\d");
        s1 = p.matcher(s1).replaceAll("\\\\d");
        b.setLength(0);
        String s3 = gli1.b();
        Object obj = B.a(s1).matcher("999999999999999");
        ((Matcher) (obj)).find();
        obj = ((Matcher) (obj)).group();
        if (((String) (obj)).length() < z.length())
        {
            s1 = "";
        } else
        {
            s1 = ((String) (obj)).replaceAll(s1, s3).replaceAll("9", "\u2008");
        }
        if (s1.length() <= 0) goto _L4; else goto _L5
_L5:
        b.append(s1);
        flag = true;
_L7:
        if (flag)
        {
            c = s2;
            x = r.matcher(gli1.d()).find();
            t = 0;
            return true;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        flag = false;
        if (true) goto _L7; else goto _L6
_L6:
        iterator.remove();
          goto _L8
_L2:
        f = false;
        return false;
    }

    private String d()
    {
        f = true;
        i = false;
        A.clear();
        t = 0;
        b.setLength(0);
        c = "";
        return f();
    }

    private String e()
    {
        for (Iterator iterator = A.iterator(); iterator.hasNext();)
        {
            gli gli1 = (gli)iterator.next();
            Matcher matcher = B.a(gli1.a()).matcher(z);
            if (matcher.matches())
            {
                x = r.matcher(gli1.d()).find();
                return c(matcher.replaceAll(gli1.b()));
            }
        }

        return "";
    }

    private String f()
    {
        if (z.length() >= 3)
        {
            String s1 = z.toString();
            Object obj;
            boolean flag;
            if (h && n.A() > 0)
            {
                obj = n.z();
            } else
            {
                obj = n.x();
            }
            flag = n.p();
            obj = ((List) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                gli gli1 = (gli)((Iterator) (obj)).next();
                if (!flag || h || gli1.e() || gkv.c(gli1.d()))
                {
                    String s2 = gli1.b();
                    if (q.matcher(s2).matches())
                    {
                        A.add(gli1);
                    }
                }
            } while (true);
            b(s1);
            obj = e();
            if (((String) (obj)).length() > 0)
            {
                return ((String) (obj));
            }
            if (c())
            {
                return g();
            } else
            {
                return d.toString();
            }
        } else
        {
            return c(z.toString());
        }
    }

    private String g()
    {
        int j1 = z.length();
        if (j1 > 0)
        {
            String s1 = "";
            for (int i1 = 0; i1 < j1; i1++)
            {
                s1 = c(z.charAt(i1));
            }

            if (f)
            {
                return c(s1);
            } else
            {
                return d.toString();
            }
        } else
        {
            return w.toString();
        }
    }

    private String h()
    {
        int i1;
        boolean flag = true;
        String s1;
        if (n.n() == 1 && z.charAt(0) == '1' && z.charAt(1) != '0' && z.charAt(1) != '1')
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        w.append('1').append(' ');
        h = true;
        i1 = ((flag) ? 1 : 0);
_L4:
        s1 = z.substring(0, i1);
        z.delete(0, i1);
        return s1;
_L2:
        if (n.t())
        {
            Matcher matcher = B.a(n.u()).matcher(z);
            if (matcher.lookingAt() && matcher.end() > 0)
            {
                h = true;
                i1 = matcher.end();
                w.append(z.substring(0, i1));
                continue; /* Loop/switch isn't completed */
            }
        }
        i1 = 0;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private boolean i()
    {
        gls gls1 = B;
        Object obj = String.valueOf("\\+|");
        String s1 = String.valueOf(n.o());
        if (s1.length() != 0)
        {
            obj = ((String) (obj)).concat(s1);
        } else
        {
            obj = new String(((String) (obj)));
        }
        obj = gls1.a(((String) (obj))).matcher(e);
        if (((Matcher) (obj)).lookingAt())
        {
            h = true;
            int i1 = ((Matcher) (obj)).end();
            z.setLength(0);
            z.append(e.substring(i1));
            w.setLength(0);
            w.append(e.substring(0, i1));
            if (e.charAt(0) != '+')
            {
                w.append(' ');
            }
            return true;
        } else
        {
            return false;
        }
    }

    private boolean j()
    {
        if (z.length() != 0) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Object obj;
        int i1;
        obj = new StringBuilder();
        i1 = j.a(z, ((StringBuilder) (obj)));
        if (i1 == 0) goto _L1; else goto _L3
_L3:
        z.setLength(0);
        z.append(((CharSequence) (obj)));
        obj = j.b(i1);
        if (!"001".equals(obj)) goto _L5; else goto _L4
_L4:
        n = j.a(i1);
_L7:
        obj = Integer.toString(i1);
        w.append(((String) (obj))).append(' ');
        y = "";
        return true;
_L5:
        if (!((String) (obj)).equals(k))
        {
            n = a(((String) (obj)));
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public String a(char c1)
    {
        a = a(c1, false);
        return a;
    }

    public void a()
    {
        a = "";
        d.setLength(0);
        e.setLength(0);
        b.setLength(0);
        t = 0;
        c = "";
        w.setLength(0);
        y = "";
        z.setLength(0);
        f = true;
        g = false;
        v = 0;
        u = 0;
        h = false;
        i = false;
        A.clear();
        x = false;
        if (!n.equals(m))
        {
            n = a(k);
        }
    }

    public int b()
    {
        int i1 = 0;
        if (f) goto _L2; else goto _L1
_L1:
        int k1 = u;
_L4:
        return k1;
_L2:
        int j1 = 0;
_L6:
        k1 = i1;
        if (j1 >= v) goto _L4; else goto _L3
_L3:
        k1 = i1;
        if (i1 >= a.length()) goto _L4; else goto _L5
_L5:
        int l1 = j1;
        if (e.charAt(j1) == a.charAt(i1))
        {
            l1 = j1 + 1;
        }
        i1++;
        j1 = l1;
          goto _L6
    }

    public String b(char c1)
    {
        a = a(c1, true);
        return a;
    }

}
