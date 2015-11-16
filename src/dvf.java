// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.text.TextUtils;
import android.widget.Toast;

public final class dvf
{

    private static final boolean a = false;
    private int b;
    private String c;

    public dvf()
    {
        c = null;
        b = 0;
    }

    private static String a(int i)
    {
        if (i == 0)
        {
            return "<none>";
        }
        StringBuilder stringbuilder = new StringBuilder();
        if ((i & 1) > 0)
        {
            stringbuilder.append("RECIPIENTS_REQUIRE_MMS | ");
        }
        if ((i & 2) > 0)
        {
            stringbuilder.append("HAS_SUBJECT | ");
        }
        if ((i & 4) > 0)
        {
            stringbuilder.append("HAS_ATTACHMENT | ");
        }
        if ((i & 8) > 0)
        {
            stringbuilder.append("LENGTH_REQUIRES_MMS | ");
        }
        if ((i & 0x10) > 0)
        {
            stringbuilder.append("MULTIPLE_RECIPIENTS | ");
        }
        stringbuilder.delete(stringbuilder.length() - 3, stringbuilder.length());
        return stringbuilder.toString();
    }

    private void a(int i, boolean flag, boolean flag1)
    {
        if (dtp.a().d())
        {
            int j = b;
            if (flag)
            {
                b = b | i;
            } else
            {
                b = b & ~i;
            }
            if (flag1 && j == 0 && b != 0)
            {
                Toast.makeText(g.nU, l.aC, 0).show();
            }
            if (j != b && a)
            {
                String s = String.valueOf(a(i));
                String s1 = String.valueOf(a(b));
                eev.c("Babel_SMS", (new StringBuilder(String.valueOf(s).length() + 35 + String.valueOf(s1).length())).append("updateState: oldState: ").append(s).append(" new state: ").append(s1).toString());
                return;
            }
        }
    }

    public void a()
    {
        c = null;
        b = b & 0x11;
    }

    public void a(String s)
    {
        c = s;
        boolean flag;
        if (!TextUtils.isEmpty(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(2, flag, true);
    }

    public void a(boolean flag)
    {
        if (flag && due.c())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(16, flag, false);
    }

    public String b()
    {
        return c;
    }

    public void b(boolean flag)
    {
        a(8, flag, true);
    }

    public void c()
    {
        if (dtp.a().k() != null)
        {
            a(1, false, false);
            return;
        } else
        {
            a(1, true, false);
            return;
        }
    }

    public boolean d()
    {
        return b > 0;
    }

    static 
    {
        hnc hnc = eev.r;
    }
}
