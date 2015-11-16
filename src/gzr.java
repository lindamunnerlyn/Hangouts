// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;
import java.io.Writer;

final class gzr extends PrintWriter
{

    final gzn a;

    gzr(gzn gzn, Writer writer)
    {
        a = gzn;
        super(writer);
    }

    public String toString()
    {
        return out.toString();
    }
}
