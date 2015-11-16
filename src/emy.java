// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

public interface emy
{

    public abstract Looper a();

    public abstract ConnectionResult a(TimeUnit timeunit);

    public abstract enm a(enm enm);

    public abstract eor a(Object obj);

    public abstract void a(enb enb);

    public abstract void a(end end);

    public abstract void a(String s, PrintWriter printwriter);

    public abstract void b();

    public abstract void b(enb enb);

    public abstract void b(end end);

    public abstract ConnectionResult c();

    public abstract void d();

    public abstract boolean e();

    public abstract boolean f();
}
