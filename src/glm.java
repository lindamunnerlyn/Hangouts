// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 


final class glm
    implements Runnable
{

    final glj a;

    glm(glj glj1)
    {
        a = glj1;
        super();
    }

    public void run()
    {
        glj.a(a);
    }
}
