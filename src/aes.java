// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

final class aes extends aeq
{

    private String g;
    private boolean h;

    public aes()
    {
        h = false;
    }

    public aes(byte byte0)
    {
        super((byte)0);
        h = false;
    }

    private void b(aev aev1, String s, String s1)
    {
        int j = s1.length();
        int i = 0;
        boolean flag = false;
        StringBuilder stringbuilder = null;
        while (i < j) 
        {
            char c1 = s1.charAt(i);
            if (c1 == '"')
            {
                if (flag)
                {
                    aev1.a(s, e(stringbuilder.toString()));
                    flag = false;
                    stringbuilder = null;
                } else
                {
                    if (stringbuilder != null && stringbuilder.length() <= 0)
                    {
                        aev1.a(s, e(stringbuilder.toString()));
                    }
                    flag = true;
                }
            } else
            if (c1 == ',' && !flag)
            {
                if (stringbuilder == null)
                {
                    (new StringBuilder(String.valueOf(s1).length() + 44)).append("Comma is used before actual string comes. (").append(s1).append(")");
                } else
                {
                    aev1.a(s, e(stringbuilder.toString()));
                    stringbuilder = null;
                }
            } else
            {
                StringBuilder stringbuilder1 = stringbuilder;
                if (stringbuilder == null)
                {
                    stringbuilder1 = new StringBuilder();
                }
                stringbuilder1.append(c1);
                stringbuilder = stringbuilder1;
            }
            i++;
        }
        if (stringbuilder != null && stringbuilder.length() != 0)
        {
            aev1.a(s, e(stringbuilder.toString()));
        }
    }

    private static String e(String s)
    {
        return aex.b(s, "ISO-8859-1", "UTF-8");
    }

    protected String a()
    {
        if (g != null)
        {
            String s = g;
            g = null;
            return s;
        } else
        {
            return d.readLine();
        }
    }

    protected void a(aev aev1, String s)
    {
        String as[];
        try
        {
            super.a(aev1, s);
            return;
        }
        catch (afb afb1)
        {
            as = s.split("=", 2);
        }
        if (as.length == 2)
        {
            a(aev1, as[0], as[1]);
            return;
        }
        aev1 = String.valueOf(s);
        if (aev1.length() != 0)
        {
            aev1 = "Unknown params value: ".concat(aev1);
        } else
        {
            aev1 = new String("Unknown params value: ");
        }
        throw new afb(aev1);
    }

    protected void a(aev aev1, String s, String s1)
    {
        b(aev1, s, s1);
    }

    protected boolean a(boolean flag)
    {
        return super.a(flag);
    }

    protected void b(aev aev1)
    {
        if (!h)
        {
            h = true;
        }
    }

    protected void b(aev aev1, String s)
    {
        c(aev1, s);
    }

    protected String c()
    {
        Object obj = null;
        do
        {
            String s1;
            do
            {
                s1 = d.readLine();
                if (s1 == null)
                {
                    if (obj != null)
                    {
                        return ((StringBuilder) (obj)).toString();
                    }
                    if (g != null)
                    {
                        obj = g;
                        g = null;
                        return ((String) (obj));
                    } else
                    {
                        throw new afb("Reached end of buffer.");
                    }
                }
                if (s1.length() == 0)
                {
                    if (obj != null)
                    {
                        return ((StringBuilder) (obj)).toString();
                    }
                    if (g != null)
                    {
                        obj = g;
                        g = null;
                        return ((String) (obj));
                    }
                    continue;
                }
                if (s1.charAt(0) != ' ' && s1.charAt(0) != '\t')
                {
                    break;
                }
                if (obj != null)
                {
                    ((StringBuilder) (obj)).append(s1.substring(1));
                } else
                if (g != null)
                {
                    obj = new StringBuilder();
                    ((StringBuilder) (obj)).append(g);
                    g = null;
                    ((StringBuilder) (obj)).append(s1.substring(1));
                } else
                {
                    throw new afb("Space exists at the beginning of the line");
                }
            } while (true);
            if (g == null)
            {
                g = s1;
                if (obj != null)
                {
                    return ((StringBuilder) (obj)).toString();
                }
            } else
            {
                String s = g;
                g = s1;
                return s;
            }
        } while (true);
    }

    protected String c(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(s);
        do
        {
label0:
            {
                s = a();
                if (s == null)
                {
                    throw new afb("File ended during parsing BASE64 binary");
                }
                if (s.length() != 0)
                {
                    if (s.startsWith(" ") || s.startsWith("\t"))
                    {
                        break label0;
                    }
                    g = s;
                }
                return stringbuilder.toString();
            }
            stringbuilder.append(s);
        } while (true);
    }

    protected void c(aev aev1, String s)
    {
        b(aev1, "TYPE", s);
    }

    protected String d(String s)
    {
        StringBuilder stringbuilder = new StringBuilder();
        int j = s.length();
        int i = 0;
        while (i < j) 
        {
            char c1 = s.charAt(i);
            if (c1 == '\\' && i < j - 1)
            {
                i++;
                c1 = s.charAt(i);
                if (c1 == 'n' || c1 == 'N')
                {
                    stringbuilder.append("\n");
                } else
                {
                    stringbuilder.append(c1);
                }
            } else
            {
                stringbuilder.append(c1);
            }
            i++;
        }
        return stringbuilder.toString();
    }

    protected int f()
    {
        return 1;
    }

    protected String g()
    {
        return "3.0";
    }

    protected Set h()
    {
        return aeu.a;
    }
}
