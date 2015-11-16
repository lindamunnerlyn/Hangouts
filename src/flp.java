// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.StreetViewPanoramaOrientation;

public final class flp
    implements android.os.Parcelable.Creator
{

    public flp()
    {
    }

    public static StreetViewPanoramaOrientation a(Parcel parcel)
    {
        float f1 = 0.0F;
        int j = g.a(parcel);
        int i = 0;
        float f = 0.0F;
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
                    f = g.g(parcel, k);
                    break;

                case 3: // '\003'
                    f1 = g.g(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new StreetViewPanoramaOrientation(i, f, f1);
            }
        } while (true);
    }

    public static void a(StreetViewPanoramaOrientation streetviewpanoramaorientation, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, streetviewpanoramaorientation.a());
        g.a(parcel, 2, streetviewpanoramaorientation.a);
        g.a(parcel, 3, streetviewpanoramaorientation.b);
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new StreetViewPanoramaOrientation[i];
    }
}
