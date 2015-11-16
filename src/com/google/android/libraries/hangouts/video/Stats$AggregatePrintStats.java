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

    final ArrayList a = new ArrayList();
    final ArrayList b = new ArrayList();
    boolean c;

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
