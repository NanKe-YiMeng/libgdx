/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.11
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.badlogic.gdx.physics.bullet.collision;

import com.badlogic.gdx.physics.bullet.BulletBase;
import com.badlogic.gdx.physics.bullet.linearmath.*;
import com.badlogic.gdx.math.Vector3;
import com.badlogic.gdx.math.Quaternion;
import com.badlogic.gdx.math.Matrix3;
import com.badlogic.gdx.math.Matrix4;

public class GIM_AABB extends BulletBase {
	private long swigCPtr;
	
	protected GIM_AABB(final String className, long cPtr, boolean cMemoryOwn) {
		super(className, cPtr, cMemoryOwn);
		swigCPtr = cPtr;
	}
	
	/** Construct a new GIM_AABB, normally you should not need this constructor it's intended for low-level usage. */ 
	public GIM_AABB(long cPtr, boolean cMemoryOwn) {
		this("GIM_AABB", cPtr, cMemoryOwn);
		construct();
	}
	
	@Override
	protected void reset(long cPtr, boolean cMemoryOwn) {
		if (!destroyed)
			destroy();
		super.reset(swigCPtr = cPtr, cMemoryOwn);
	}
	
	public static long getCPtr(GIM_AABB obj) {
		return (obj == null) ? 0 : obj.swigCPtr;
	}

	@Override
	protected void finalize() throws Throwable {
		if (!destroyed)
			destroy();
		super.finalize();
	}

  @Override protected synchronized void delete() {
		if (swigCPtr != 0) {
			if (swigCMemOwn) {
				swigCMemOwn = false;
				CollisionJNI.delete_GIM_AABB(swigCPtr);
			}
			swigCPtr = 0;
		}
		super.delete();
	}

  public void setMin(btVector3 value) {
    CollisionJNI.GIM_AABB_min_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getMin() {
    long cPtr = CollisionJNI.GIM_AABB_min_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public void setMax(btVector3 value) {
    CollisionJNI.GIM_AABB_max_set(swigCPtr, this, btVector3.getCPtr(value), value);
  }

  public btVector3 getMax() {
    long cPtr = CollisionJNI.GIM_AABB_max_get(swigCPtr, this);
    return (cPtr == 0) ? null : new btVector3(cPtr, false);
  }

  public GIM_AABB() {
    this(CollisionJNI.new_GIM_AABB__SWIG_0(), true);
  }

  public GIM_AABB(Vector3 V1, Vector3 V2, Vector3 V3) {
    this(CollisionJNI.new_GIM_AABB__SWIG_1(V1, V2, V3), true);
  }

  public GIM_AABB(Vector3 V1, Vector3 V2, Vector3 V3, SWIGTYPE_p_GREAL margin) {
    this(CollisionJNI.new_GIM_AABB__SWIG_2(V1, V2, V3, SWIGTYPE_p_GREAL.getCPtr(margin)), true);
  }

  public GIM_AABB(GIM_AABB other) {
    this(CollisionJNI.new_GIM_AABB__SWIG_3(GIM_AABB.getCPtr(other), other), true);
  }

  public GIM_AABB(GIM_AABB other, float margin) {
    this(CollisionJNI.new_GIM_AABB__SWIG_4(GIM_AABB.getCPtr(other), other, margin), true);
  }

  public void invalidate() {
    CollisionJNI.GIM_AABB_invalidate(swigCPtr, this);
  }

  public void increment_margin(float margin) {
    CollisionJNI.GIM_AABB_increment_margin(swigCPtr, this, margin);
  }

  public void copy_with_margin(GIM_AABB other, float margin) {
    CollisionJNI.GIM_AABB_copy_with_margin(swigCPtr, this, GIM_AABB.getCPtr(other), other, margin);
  }

  public void appy_transform(Matrix4 trans) {
    CollisionJNI.GIM_AABB_appy_transform(swigCPtr, this, trans);
  }

  public void merge(GIM_AABB box) {
    CollisionJNI.GIM_AABB_merge(swigCPtr, this, GIM_AABB.getCPtr(box), box);
  }

  public void get_center_extend(Vector3 center, Vector3 extend) {
    CollisionJNI.GIM_AABB_get_center_extend(swigCPtr, this, center, extend);
  }

  public void find_intersection(GIM_AABB other, GIM_AABB intersection) {
    CollisionJNI.GIM_AABB_find_intersection(swigCPtr, this, GIM_AABB.getCPtr(other), other, GIM_AABB.getCPtr(intersection), intersection);
  }

  public boolean has_collision(GIM_AABB other) {
    return CollisionJNI.GIM_AABB_has_collision(swigCPtr, this, GIM_AABB.getCPtr(other), other);
  }

  public boolean collide_ray(Vector3 vorigin, Vector3 vdir) {
    return CollisionJNI.GIM_AABB_collide_ray(swigCPtr, this, vorigin, vdir);
  }

  public void projection_interval(Vector3 direction, SWIGTYPE_p_float vmin, SWIGTYPE_p_float vmax) {
    CollisionJNI.GIM_AABB_projection_interval(swigCPtr, this, direction, SWIGTYPE_p_float.getCPtr(vmin), SWIGTYPE_p_float.getCPtr(vmax));
  }

  public int plane_classify(btVector4 plane) {
    return CollisionJNI.GIM_AABB_plane_classify(swigCPtr, this, btVector4.getCPtr(plane), plane);
  }

  public boolean overlapping_trans_conservative(GIM_AABB box, Matrix4 trans1_to_0) {
    return CollisionJNI.GIM_AABB_overlapping_trans_conservative(swigCPtr, this, GIM_AABB.getCPtr(box), box, trans1_to_0);
  }

  public boolean overlapping_trans_cache(GIM_AABB box, GIM_BOX_BOX_TRANSFORM_CACHE transcache, boolean fulltest) {
    return CollisionJNI.GIM_AABB_overlapping_trans_cache(swigCPtr, this, GIM_AABB.getCPtr(box), box, GIM_BOX_BOX_TRANSFORM_CACHE.getCPtr(transcache), transcache, fulltest);
  }

  public boolean collide_plane(btVector4 plane) {
    return CollisionJNI.GIM_AABB_collide_plane(swigCPtr, this, btVector4.getCPtr(plane), plane);
  }

  public boolean collide_triangle_exact(Vector3 p1, Vector3 p2, Vector3 p3, btVector4 triangle_plane) {
    return CollisionJNI.GIM_AABB_collide_triangle_exact(swigCPtr, this, p1, p2, p3, btVector4.getCPtr(triangle_plane), triangle_plane);
  }

}
