// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.LatLng;

public final class flh
    implements android.os.Parcelable.Creator
{

    public flh()
    {
    }

    public static LatLng a(Parcel parcel)
    {
        double d = 0.0D;
        int j = g.a(parcel);
        int i = 0;
        double d1 = 0.0D;
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
                    d1 = g.h(parcel, k);
                    break;

                case 3: // '\003'
                    d = g.h(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new LatLng(i, d1, d);
            }
        } while (true);
    }

    public static void a(LatLng latlng, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, latlng.a());
        g.a(parcel, 2, latlng.a);
        g.a(parcel, 3, latlng.b);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new LatLng[i];
    }
}
