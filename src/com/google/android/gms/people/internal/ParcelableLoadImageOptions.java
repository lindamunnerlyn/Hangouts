// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import eof;
import fpm;
import g;

public class ParcelableLoadImageOptions
    implements SafeParcelable
{

    public static final fpm CREATOR = new fpm();
    private final int a;
    private final int b;
    private final int c;
    private final boolean d;

    public ParcelableLoadImageOptions(int i, int j, int k, boolean flag)
    {
        a = i;
        b = j;
        c = k;
        d = flag;
    }

    public int a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public String toString()
    {
        return g.c(this).a("imageSize", Integer.valueOf(b)).a("avatarOptions", Integer.valueOf(c)).a("useLargePictureForCp2Images", Boolean.valueOf(d)).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        fpm.a(this, parcel);
    }

}
