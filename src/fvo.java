// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.wearable.internal.PackageStorageInfo;

public final class fvo
    implements android.os.Parcelable.Creator
{

    public fvo()
    {
    }

    public static void a(PackageStorageInfo packagestorageinfo, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, packagestorageinfo.a);
        g.a(parcel, 2, packagestorageinfo.b);
        g.a(parcel, 3, packagestorageinfo.c);
        g.a(parcel, 4, packagestorageinfo.d);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        String s = null;
        int j = g.a(parcel);
        int i = 0;
        long l = 0L;
        String s1 = null;
        do
        {
            if (parcel.dataPosition() < j)
            {
                int k = parcel.readInt();
                switch (0xffff & k)
                {
                default:
                    g.b(parcel, k);
                    break;

                case 1: // '\001'
                    i = g.e(parcel, k);
                    break;

                case 2: // '\002'
                    s1 = g.i(parcel, k);
                    break;

                case 3: // '\003'
                    s = g.i(parcel, k);
                    break;

                case 4: // '\004'
                    l = g.f(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new PackageStorageInfo(i, s1, s, l);
            }
        } while (true);
    }

    public Object[] newArray(int i)
    {
        return new PackageStorageInfo[i];
    }
}
