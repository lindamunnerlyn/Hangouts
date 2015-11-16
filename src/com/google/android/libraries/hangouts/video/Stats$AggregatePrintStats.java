// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.hangouts.video;

import java.io.PrintWriter;
import java.util.ArrayList;

// Referenced classes of package com.google.android.libraries.hangouts.video:
//            Stats

public class c
{

    private final ArrayList a = new ArrayList();
    private final ArrayList b = new ArrayList();
    private boolean c;

    static ArrayList a(c c1)
    {
        return c1.a;
    }

    static boolean a(a a1, boolean flag)
    {
        a1.c = flag;
        return flag;
    }

    static ArrayList b(c c1)
    {
        return c1.b;
    }

    public void a(PrintWriter printwriter)
    {
        printwriter.println("Aggregate statistics");
        int i = Math.round(Stats.a(a));
        printwriter.println((new StringBuilder(36)).append("               send FPS: ").append(i).toString());
        i = Math.round(Stats.a(b));
        printwriter.println((new StringBuilder(39)).append("  Median video receive FPS: ").append(i).toString());
        boolean flag = c;
        printwriter.println((new StringBuilder(20)).append("  using relay: ").append(flag).toString());
    }

    public ()
    {
        c = false;
    }
}
