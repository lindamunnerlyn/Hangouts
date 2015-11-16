// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class dof
    implements Runnable
{

    final doc a;

    dof(doc doc1)
    {
        a = doc1;
        super();
    }

    public void run()
    {
        doc.a(a);
    }
}
