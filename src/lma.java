// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;

public final class lma
    implements android.os.Parcelable.Creator
{

    public lma()
    {
    }

    public Object createFromParcel(Parcel parcel)
    {
        return new org.chromium.base.library_loader.Linker.LibInfo(parcel);
    }

    public Object[] newArray(int i)
    {
        return new org.chromium.base.library_loader.Linker.LibInfo[i];
    }
}
