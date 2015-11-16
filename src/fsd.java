// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.ExecutorService;

final class fsd extends fru
{

    private final fro a;
    private final ExecutorService b;

    public fsd(fro fro1, ExecutorService executorservice)
    {
        a = fro1;
        b = executorservice;
    }

    static a a(fsd fsd1)
    {
        return fsd1.a.d();
    }

    public void a(String s, String s1, fry fry)
    {
        b.submit(new fsf(this, s, s1, fry));
    }

    public void a(String s, List list, fry fry)
    {
        b.submit(new fse(this, list, s, fry));
    }
}
