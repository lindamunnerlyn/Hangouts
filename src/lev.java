// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Serializable;
import java.util.Locale;

public abstract class lev
    implements Serializable
{

    private static final long serialVersionUID = 0x1b5b33e6c8f3f47dL;

    public lev()
    {
    }

    public String a(Locale locale)
    {
        return a().a(b(), locale);
    }

    public abstract lcy a();

    public abstract long b();

    public String b(Locale locale)
    {
        return a().b(b(), locale);
    }

    public int c(Locale locale)
    {
        return a().a(locale);
    }

    public lcw c()
    {
        throw new UnsupportedOperationException("The method getChronology() was added in v1.4 and needs to be implemented by subclasses of AbstractReadableInstantFieldProperty");
    }

    public lcz d()
    {
        return a().a();
    }

    public String e()
    {
        return a().b();
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof lev))
            {
                return false;
            }
            obj = (lev)obj;
            if (f() != ((lev) (obj)).f() || !d().equals(((lev) (obj)).d()) || !h.c(c(), ((lev) (obj)).c()))
            {
                return false;
            }
        }
        return true;
    }

    public int f()
    {
        return a().a(b());
    }

    public int g()
    {
        return a().g();
    }

    public int h()
    {
        return a().h();
    }

    public int hashCode()
    {
        return f() * 17 + d().hashCode() + c().hashCode();
    }

    public String toString()
    {
        String s = e();
        return (new StringBuilder(String.valueOf(s).length() + 10)).append("Property[").append(s).append("]").toString();
    }
}
