// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.ParcelFileDescriptor;

public interface fmi
    extends ekf, ekg
{

    public abstract ParcelFileDescriptor c();

    public abstract int d();

    public abstract int e();
}
