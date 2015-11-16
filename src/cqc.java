// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

final class cqc
{

    private final beb a = (new bec()).a("phoneverification").b("Module that hosts the phone verification UI.").a(true).a();

    public cqc()
    {
    }

    public cpx a(Context context)
    {
        return (cpx)a.a(context, new cqe());
    }

    public beb[] a()
    {
        return (new beb[] {
            a
        });
    }

    public cqv[] b(Context context)
    {
        return (cqv[])a.a(context, cqv, new cqb(false));
    }
}
