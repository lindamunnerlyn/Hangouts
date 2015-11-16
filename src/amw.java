// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class amw
    implements Serializable
{

    private final String a;
    private final List b;
    private final List c;
    private final boolean d;
    private String e;
    private String f;

    public amw(String s)
    {
        b = new ArrayList();
        c = new ArrayList();
        a = s;
        d = false;
    }

    public amw(String s, boolean flag)
    {
        b = new ArrayList();
        c = new ArrayList();
        a = s;
        d = flag;
    }

    public String a()
    {
        return a;
    }

    public void a(amv amv)
    {
        b.add(amv);
    }

    public void a(and and)
    {
        c.add(and);
    }

    public void a(String s)
    {
        e = s;
    }

    public List b()
    {
        if (c != null)
        {
            return Collections.unmodifiableList(c);
        } else
        {
            return Collections.emptyList();
        }
    }

    public void b(String s)
    {
        f = s;
    }

    public List c()
    {
        if (b != null)
        {
            return Collections.unmodifiableList(b);
        } else
        {
            return Collections.emptyList();
        }
    }

    public String d()
    {
        return e;
    }

    public String e()
    {
        return f;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (amw)obj;
            return a.equals(((amw) (obj)).a);
        }
    }

    public boolean f()
    {
        return d;
    }

    public int hashCode()
    {
        return a.hashCode();
    }

    public String toString()
    {
        String s = String.valueOf(eev.b(a));
        String s1 = String.valueOf(Arrays.toString(c().toArray()));
        String s2 = String.valueOf(Arrays.toString(b().toArray()));
        String s3 = String.valueOf(eev.b(e));
        String s4 = String.valueOf(eev.b(f));
        return (new StringBuilder(String.valueOf(s).length() + 75 + String.valueOf(s1).length() + String.valueOf(s2).length() + String.valueOf(s3).length() + String.valueOf(s4).length())).append("GaiaId {gaiaId: ").append(s).append(" | emails: ").append(s1).append(" | phoneNumbers: ").append(s2).append(" | avatarUrl: ").append(s3).append(" | displayName: ").append(s4).append("}").toString();
    }
}
