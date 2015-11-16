// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;
import java.io.Writer;

final class gvi extends PrintWriter
{

    final gvh a;

    gvi(gvh gvh, Writer writer)
    {
        a = gvh;
        super(writer);
    }

    public String toString()
    {
        return out.toString();
    }
}
