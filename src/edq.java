// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.text.TextUtils;

public class edq extends edt
{

    private int a;
    private int e;
    private int f;
    private int g;
    private boolean h;
    private boolean i;
    private int j;
    private boolean k;
    private boolean l;
    private ann m;
    private boolean n;

    public edq(String s, String s1)
    {
        super(s, s1);
        a = -1;
        e = -1;
    }

    public static StringBuilder a(int i1, int j1, boolean flag, boolean flag1, boolean flag2)
    {
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder();
        if (flag2)
        {
            stringbuilder.append("d");
            stringbuilder.append("-ip");
            return stringbuilder;
        }
        if (j1 != i1) goto _L2; else goto _L1
_L1:
        stringbuilder.append("s").append(i1);
        if (flag)
        {
            stringbuilder.append("-c");
        }
_L4:
        if (flag1)
        {
            stringbuilder.append("-k");
        }
        stringbuilder.append("-no");
        return stringbuilder;
_L2:
        stringbuilder.append("w").append(i1).append("-h").append(j1);
        if (flag)
        {
            stringbuilder.append("-n");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public edq a(int i1)
    {
        g = i1;
        f = i1;
        return this;
    }

    public edq a(int i1, int j1)
    {
        g = i1;
        f = j1;
        return this;
    }

    public edq a(ann ann1)
    {
        m = ann1;
        return this;
    }

    public edq a(boolean flag)
    {
        h = flag;
        return this;
    }

    public void a()
    {
        String s;
        Object obj;
        if (TextUtils.isEmpty(n()))
        {
            s = null;
        } else
        if (n().startsWith("content://"))
        {
            s = n();
        } else
        {
            int i1;
            int j1;
            if (e == -1)
            {
                i1 = g;
            } else
            {
                i1 = e;
            }
            if (a == -1)
            {
                j1 = f;
            } else
            {
                j1 = a;
            }
            s = n();
            obj = a(i1, j1, h, k, d);
            if (TextUtils.isEmpty(s))
            {
                s = null;
            } else
            if (!dou.a(s))
            {
                String s1 = Uri.parse(s).getScheme();
                boolean flag;
                if (TextUtils.equals(s1, "content"))
                {
                    flag = true;
                } else
                if (s1 == null)
                {
                    s = String.valueOf(s);
                    if (s.length() != 0)
                    {
                        s = "https:".concat(s);
                    } else
                    {
                        s = new String("https:");
                    }
                    flag = false;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    obj = String.valueOf(((StringBuilder) (obj)).toString());
                    s = (new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(obj).length())).append(s).append("?").append(((String) (obj))).toString();
                } else
                {
                    s = cpa.a(((StringBuilder) (obj)).toString(), s).toString();
                }
            }
        }
        b = s;
        obj = a(g, f, h, k, d);
        if (m == ann.c)
        {
            ((StringBuilder) (obj)).append("-gvsms");
        } else
        if (m == ann.b)
        {
            ((StringBuilder) (obj)).append("-sms");
        }
        if (l)
        {
            ((StringBuilder) (obj)).append("-force");
        }
        if (n)
        {
            ((StringBuilder) (obj)).append("-rounded");
        }
        s = String.valueOf(n());
        obj = String.valueOf(((StringBuilder) (obj)).toString());
        if (((String) (obj)).length() != 0)
        {
            s = s.concat(((String) (obj)));
        } else
        {
            s = new String(s);
        }
        c = s;
    }

    public edq b()
    {
        j = 0;
        return this;
    }

    public edq b(int i1, int j1)
    {
        e = i1;
        a = j1;
        return this;
    }

    public edq b(boolean flag)
    {
        n = flag;
        return this;
    }

    public edq c()
    {
        d = true;
        return this;
    }

    public edq c(boolean flag)
    {
        i = flag;
        return this;
    }

    public int d()
    {
        return g;
    }

    public edq d(boolean flag)
    {
        k = flag;
        return this;
    }

    public int e()
    {
        return f;
    }

    public edq e(boolean flag)
    {
        l = flag;
        return this;
    }

    public boolean f()
    {
        return h;
    }

    public boolean g()
    {
        return i;
    }

    public int h()
    {
        return j;
    }

    public boolean i()
    {
        return n;
    }

    public boolean j()
    {
        return k;
    }

    public boolean k()
    {
        return l;
    }

    public boolean l()
    {
        return m != null && m != ann.a;
    }

    public ann m()
    {
        return m;
    }
}
