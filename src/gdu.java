// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.libraries.hangouts.video.MediaSources;
import com.google.android.libraries.hangouts.video.Stats;

public interface gdu
{

    public abstract void a(int i, int j, byte abyte0[]);

    public abstract void a(int i, String s);

    public abstract void a(long l);

    public abstract void a(long l, String s, byte abyte0[], int i);

    public abstract void a(long l, String s, byte abyte0[], long l1);

    public abstract void a(Stats stats);

    public abstract void a(String s, int i);

    public abstract void a(String s, int i, int j);

    public abstract void a(String s, int i, int j, String s1, String s2, String s3, byte abyte0[]);

    public abstract void a(String s, int i, String s1, String s2);

    public abstract void a(String s, String s1, MediaSources mediasources);

    public abstract void a(String s, boolean flag, String s1, boolean flag1, boolean flag2, String s2);

    public abstract void a(com.google.android.libraries.hangouts.video.ConnectivityReporter.NicInfo anicinfo[]);

    public abstract void b(int i);

    public abstract void b(long l, String s, byte abyte0[], int i);

    public abstract void c(int i);

    public abstract void c(boolean flag);

    public abstract void d();

    public abstract void d(int i);

    public abstract void e();

    public abstract void e(String s);

    public abstract void f(String s);
}
