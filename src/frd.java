// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.IInterface;
import com.google.android.gms.playlog.internal.LogEvent;
import com.google.android.gms.playlog.internal.PlayLoggerContext;
import java.util.List;

public interface frd
    extends IInterface
{

    public abstract void a(String s, PlayLoggerContext playloggercontext, LogEvent logevent);

    public abstract void a(String s, PlayLoggerContext playloggercontext, List list);

    public abstract void a(String s, PlayLoggerContext playloggercontext, byte abyte0[]);
}
