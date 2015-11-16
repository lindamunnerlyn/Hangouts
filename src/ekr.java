// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.gms.wearable.Asset;
import java.util.ArrayList;

public final class ekr
{

    private fvi a;

    public ekr()
    {
        this(new fvi());
    }

    public ekr(fvi fvi1)
    {
        a = fvi1;
    }

    public String a()
    {
        return a.b("18", "");
    }

    public void a(int i)
    {
        a.a("22", i - 1);
    }

    public void a(long l)
    {
        a.a("26", l);
    }

    public void a(Asset asset)
    {
        a.a("5", asset);
    }

    public void a(String s)
    {
        a.a("7", s);
    }

    public void a(ArrayList arraylist)
    {
        a.a("16", arraylist);
    }

    public void a(boolean flag)
    {
        a.a("11", flag);
    }

    public Asset b()
    {
        return a.g("5");
    }

    public void b(int i)
    {
        a.a("34", i);
    }

    public void b(String s)
    {
        a.a("18", s);
    }

    public void b(ArrayList arraylist)
    {
        a.c("30", arraylist);
    }

    public void b(boolean flag)
    {
        a.a("14", flag);
    }

    public long c()
    {
        return a.e("26");
    }

    public void c(String s)
    {
        a.a("23", s);
    }

    public void c(boolean flag)
    {
        a.a("33", flag);
    }

    public void d(String s)
    {
        a.a("27", s);
    }

    public void e(String s)
    {
        a.a("31", s);
    }
}
