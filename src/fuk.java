// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.List;
import java.util.concurrent.ExecutorService;

final class fuk extends fub
{

    final ftv a;
    private final ExecutorService b;

    public fuk(ftv ftv, ExecutorService executorservice)
    {
        a = ftv;
        b = executorservice;
    }

    public void a(String s, String s1, fuf fuf)
    {
        b.submit(new fum(this, s, s1, fuf));
    }

    public void a(String s, List list, fuf fuf)
    {
        b.submit(new ful(this, list, s, fuf));
    }
}
