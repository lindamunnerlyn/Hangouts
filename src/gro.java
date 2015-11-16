// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public final class gro
    implements gxm, hmy
{

    private final List b = Arrays.asList(new hmz[] {
        new grp(this, "print")
    });
    private final gqz c;

    public gro(gqz gqz1)
    {
        c = gqz1;
    }

    public void a(PrintWriter printwriter)
    {
        printwriter.append(c.b());
    }
}
