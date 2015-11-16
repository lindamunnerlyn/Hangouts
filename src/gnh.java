// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;
import java.util.Arrays;
import java.util.List;

public final class gnh
    implements gta, hig
{

    private final List b = Arrays.asList(new hih[] {
        new gni(this, "print")
    });
    private final gms c;

    public gnh(gms gms1)
    {
        c = gms1;
    }

    public void a(PrintWriter printwriter)
    {
        printwriter.append(c.b());
    }
}
