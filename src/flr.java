// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Parcel;
import com.google.android.gms.maps.model.TileOverlayOptions;

public final class flr
    implements android.os.Parcelable.Creator
{

    public flr()
    {
    }

    public static TileOverlayOptions a(Parcel parcel)
    {
        boolean flag1 = false;
        int j = g.a(parcel);
        android.os.IBinder ibinder = null;
        float f = 0.0F;
        boolean flag = true;
        int i = 0;
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
                    ibinder = g.j(parcel, k);
                    break;

                case 3: // '\003'
                    flag1 = g.c(parcel, k);
                    break;

                case 4: // '\004'
                    f = g.g(parcel, k);
                    break;

                case 5: // '\005'
                    flag = g.c(parcel, k);
                    break;
                }
            } else
            if (parcel.dataPosition() != j)
            {
                throw new af((new StringBuilder("Overread allowed size end=")).append(j).toString(), parcel);
            } else
            {
                return new TileOverlayOptions(i, ibinder, flag1, f, flag);
            }
        } while (true);
    }

    public static void a(TileOverlayOptions tileoverlayoptions, Parcel parcel)
    {
        int i = g.p(parcel, 20293);
        g.b(parcel, 1, tileoverlayoptions.a());
        g.a(parcel, 2, tileoverlayoptions.b());
        g.a(parcel, 3, tileoverlayoptions.d());
        g.a(parcel, 4, tileoverlayoptions.c());
        g.a(parcel, 5, tileoverlayoptions.e());
        g.q(parcel, i);
    }

    public Object createFromParcel(Parcel parcel)
    {
        return a(parcel);
    }

    public Object[] newArray(int i)
    {
        return new TileOverlayOptions[i];
    }
}
