// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.PrintWriter;
import java.io.StringWriter;

public final class hii extends PrintWriter
{

    public hii()
    {
        super(new StringWriter());
    }

    public String toString()
    {
        return out.toString();
    }
}
