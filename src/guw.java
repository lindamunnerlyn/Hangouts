// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;
import java.io.Writer;

final class guw extends PrintWriter
{

    final guv a;

    guw(guv guv, Writer writer)
    {
        a = guv;
        super(writer);
    }

    public String toString()
    {
        return out.toString();
    }
}
