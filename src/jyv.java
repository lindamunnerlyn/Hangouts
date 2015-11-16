// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.io.Closeable;
import java.util.logging.Level;
import java.util.logging.Logger;

final class jyv
    implements jyx
{

    static final jyv a = new jyv();

    jyv()
    {
    }

    public void a(Closeable closeable, Throwable throwable, Throwable throwable1)
    {
        throwable = jyt.a;
        Level level = Level.WARNING;
        closeable = String.valueOf(closeable);
        throwable.log(level, (new StringBuilder(String.valueOf(closeable).length() + 42)).append("Suppressing exception thrown when closing ").append(closeable).toString(), throwable1);
    }

}
